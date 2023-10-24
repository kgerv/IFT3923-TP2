import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

public class Age {
    private File testFile;
    private String testFileName;
    private long testFileAge;

    public Age(File testFile) {
        this.testFile = testFile;
        this.testFileName = testFile.getName();
        this.testFileAge = testFile.lastModified();
    }

    // returns the difference between the last modification of a file and its test file in days
    public int calculateAgeDifference() {
        int days = 0;
        long diff, lastModifTest = this.testFile.lastModified();
        String pkgName = this.filePackageName();
        // remove the "Test" part of the test file name to get the name of the class tested;
        // assumes test files are named after the class they are testing
        String fileTestedName = this.testFileName.replace("Test","");
        File fileTested;

        try {
            fileTested = this.getFile(fileTestedName, pkgName);
        } catch (FileNotFoundException e) {
            System.out.println("Could not find the file corresponding to the test file: " + fileTestedName);
            return days;
        }

        // since tests can be made before the class we will say tests are up to date if diff < 7 days
        diff = fileTested.lastModified() - lastModifTest;
        days = (int) (diff / 8.64e+7);
        return days;
    }

    private File getFile(String fileName, String pkgName) throws FileNotFoundException {
        File file = new File(fileName);

        return file;
    }

    private String filePackageName() {
        String absoluteFilePath, packageName = "";
        int lastIdxSeparator, packNameStart;

        absoluteFilePath = this.testFile.getPath();
        // package name start after ".*/test/java/" in the path
        packNameStart = absoluteFilePath.indexOf("java") + 5;
        lastIdxSeparator = absoluteFilePath.lastIndexOf("/");
        if(lastIdxSeparator < 0) lastIdxSeparator = absoluteFilePath.lastIndexOf("\\");
        if(packNameStart < lastIdxSeparator) // no package when this is false
            packageName = absoluteFilePath.substring(packNameStart, lastIdxSeparator);

        return packageName;
    }
}
