public class FileData implements Comparable<FileData> {

    private final String fileName;
    private final Integer fileSize;
    private final String filePath;

    public FileData(String fileName, Integer sizeInBytes, String filePath) {
        this.fileName = fileName;
        this.fileSize = sizeInBytes;
        this.filePath = filePath;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "fileName='" + fileName + '\'' +
                ", sizeInBytes=" + fileSize +
                ", filePath='" + filePath + '\'' +
                '}';
    }

    @Override
    public int compareTo(FileData o) {
        return this.getFileSize() - o.getFileSize();
    }
}
