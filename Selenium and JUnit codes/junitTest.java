import org.junit.Test;
//to test junit config
public class junitTest {
	//gets executed everytime we run junit program
	@Test
	public void test1() {
		if (add(10,3)==15) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
	@Test
	public void test2() {
		if (add(10,5)==15) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
	public int add(int x, int y){
		return x+y;
	}
}
