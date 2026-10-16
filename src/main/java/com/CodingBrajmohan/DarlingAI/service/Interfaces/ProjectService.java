package com.CodingBrajmohan.DarlingAI.service.Interfaces;
import com.CodingBrajmohan.DarlingAI.dto.project.ProjectRequest;
import com.CodingBrajmohan.DarlingAI.dto.project.ProjectResponse;
import com.CodingBrajmohan.DarlingAI.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects();

    ProjectResponse getUserProjectById(Long id);

    ProjectResponse createProject(ProjectRequest request);

    ProjectResponse updateProject(Long id, ProjectRequest request);

    void softDelete(Long id);
}
