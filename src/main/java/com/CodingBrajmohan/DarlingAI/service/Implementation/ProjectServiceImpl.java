package com.CodingBrajmohan.DarlingAI.service.Implementation;

import com.CodingBrajmohan.DarlingAI.dto.project.ProjectRequest;
import com.CodingBrajmohan.DarlingAI.dto.project.ProjectResponse;
import com.CodingBrajmohan.DarlingAI.dto.project.ProjectSummaryResponse;
import com.CodingBrajmohan.DarlingAI.entity.Project;
import com.CodingBrajmohan.DarlingAI.entity.User;
import com.CodingBrajmohan.DarlingAI.mapper.ProjectMapper;
import com.CodingBrajmohan.DarlingAI.repository.ProjectRepository;
import com.CodingBrajmohan.DarlingAI.repository.UserRepository;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;


    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        //        return projectRepository.findAllAccessibleByUser(userId)
//                .stream()
//                .map(projectMapper::toProjectSummaryResponse)
//                .collect(Collectors.toList());

        var projects = projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toListOfProjectSummaryResponse(projects);
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        User owner = userRepository.findById(userId).orElseThrow();

        Project project = Project.builder()
                .name(request.name())
                .owner(owner)
                .isPublic(false)
                .build();

        project = projectRepository.save(project);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
