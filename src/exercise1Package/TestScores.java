package exercise1Package;

public class TestScores {

	private Integer Exam1, Exam2, Exam3, Exam4;

	public TestScores(Integer exam1, Integer exam2, Integer exam3, Integer exam4) {
		super();
		Exam1 = exam1;
		Exam2 = exam2;
		Exam3 = exam3;
		Exam4 = exam4;
	}

	public Integer getExam1() {
		return Exam1;
	}

	public void setExam1(Integer exam1) {
		Exam1 = exam1;
	}

	public Integer getExam2() {
		return Exam2;
	}

	public void setExam2(Integer exam2) {
		Exam2 = exam2;
	}

	public Integer getExam3() {
		return Exam3;
	}

	public void setExam3(Integer exam3) {
		Exam3 = exam3;
	}

	public Integer getExam4() {
		return Exam4;
	}

	public void setExam4(Integer exam4) {
		Exam4 = exam4;
	}

	@Override
	public String toString() {
		return "TestScores [Exam1=" + Exam1 + ", Exam2=" + Exam2 + ", Exam3=" + Exam3 + ", Exam4=" + Exam4 + "]";
	}
}
