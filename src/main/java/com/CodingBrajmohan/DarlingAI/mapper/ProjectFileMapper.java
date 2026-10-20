package com.CodingBrajmohan.DarlingAI.mapper;

import com.CodingBrajmohan.DarlingAI.dto.project.FileNode;
import com.CodingBrajmohan.DarlingAI.entity.ProjectFile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectFileMapper {

    List<FileNode> toListOfFileNode(List<ProjectFile> projectFileList);
}
