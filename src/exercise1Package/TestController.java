package exercise1Package;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
@ManagedBean
@ApplicationScoped
public class TestController {

	private List<TestScores> scoresList;
	
	public TestController() {
		this.scoresList = new ArrayList<TestScores>();
		
		scoresList.add(new TestScores(1, 2, 3, 4));
		scoresList.add(new TestScores(10, 20, 30, 40));
		scoresList.add(new TestScores(50, 51, 52, 53));
		scoresList.add(new TestScores(5, 6, 7, 8));
		scoresList.add(new TestScores(9, 10, 11, 12));
		scoresList.add(new TestScores(13, 14, 15, 16));
		scoresList.add(new TestScores(17, 18, 19, 20));
		scoresList.add(new TestScores(21, 22, 23, 24));
		scoresList.add(new TestScores(25, 26, 27, 28));
		scoresList.add(new TestScores(29, 30, 31, 32));
		scoresList.add(new TestScores(33, 34, 35, 36));
		scoresList.add(new TestScores(37, 38, 39, 40));
	}

	public List<TestScores> getScoresList() {
		return scoresList;
	}
}
