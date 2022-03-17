package kr.hs.study.beans;

public class TestBean3 {
	private DataBean3 data1;
	private DataBean3 data2;
	public TestBean3(DataBean3 data1, DataBean3 data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	public DataBean3 getData1() {
		return data1;
	}
	public DataBean3 getData2() {
		return data2;
	}
	
}
