package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {

	public Project addProject(Project project) {
		ProjectDao projectDao = new ProjectDao();
		return projectDao.insertProject(project);
		
		
		
		
	}

}
