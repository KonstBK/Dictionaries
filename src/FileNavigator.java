import java.util.*;

public class FileNavigator {

    Map<String, ArrayList<FileData>> filesData = new HashMap<>();

    public void add(String pathway , FileData file){
        if (pathway.equals(file.getFilePath())) {
            if (filesData.containsKey(pathway)){
                filesData.get(pathway).add(file);
            }else{
                filesData.put(pathway, new ArrayList<>());
                filesData.get(pathway).add(file);
            }
        }else {
            StringBuilder errorMessage =
                    new StringBuilder("The path that was passed to the parameters and the file path do not match. ");
            errorMessage
                    .append("Path in parameter: ")
                    .append(pathway)
                    .append(", path in file :")
                    .append(file.getFilePath())
                    .append("\n");
            System.out.println(errorMessage);
        }
    }

    public ArrayList<FileData> find(String pathway){
        return filesData.get(pathway);
    }

    public List<FileData> filterBySize(Integer sizeInBytes){
        List<FileData> filteredFiles = new ArrayList<>();
        for (ArrayList<FileData> fileData: filesData.values()) {
            for (FileData file : fileData) {
                if (file.getFileSize() <= sizeInBytes){
                    filteredFiles.add(file);
                }
            }
        }
        return filteredFiles;
    }

    public void remove(String pathway){
        filesData.remove(pathway);
    }

    public List<FileData> sortBySize(){
        List<FileData> sortedFiles = new ArrayList<>();
        for (ArrayList<FileData> fileData: filesData.values()) {
            sortedFiles.addAll(fileData);
        }
        Collections.sort(sortedFiles);
        return sortedFiles;
    }
}
