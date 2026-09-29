package com.CodingBrajmohan.DarlingAI.service.Implementation;

import com.CodingBrajmohan.DarlingAI.dto.project.FileContentResponse;
import com.CodingBrajmohan.DarlingAI.dto.project.FileNode;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}