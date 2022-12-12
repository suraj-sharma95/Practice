class A{
protected void m1(){
System.out.println("class A m1 method");
	}
}
public class Test extends A{
	public static void main(String[] args){
	A a=new A();
	a.m1();
	Test t=new Test();
	t.m1();
	A a1=new Test();
	a1.m1();

	}

} 