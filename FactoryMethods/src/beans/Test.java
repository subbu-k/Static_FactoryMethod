package beans;

public class Test {
	private static Test t;
private Test() {
	
}
public static Test getInstance() {
	if(t== null) {
		t= new Test();
		return t;
	}else {
		return t;
	}
}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
