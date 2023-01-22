package project.service;
import project.entity.Project;
import project.dao.ProjectDao;

public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}
}
