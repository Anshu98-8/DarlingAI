package com.CodingBrajmohan.DarlingAI.service.Interfaces;

import com.CodingBrajmohan.DarlingAI.dto.project.FileContentResponse;
import com.CodingBrajmohan.DarlingAI.dto.project.FileNode;
import com.CodingBrajmohan.DarlingAI.dto.project.FileTreeResponse;

import java.util.List;

public interface ProjectFileService {
    FileTreeResponse getFileTree(Long projectId);

    FileContentResponse getFileContent(Long projectId, String path);

    void saveFile(Long projectId, String filePath, String fileContent);
}
