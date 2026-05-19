package interface_;

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class cat implements Animal {
	public void sound() {
		System.out.println("Cat Meow !");
	}
	
}