package book;

import java.util.LinkedList;
import java.util.Queue;

public class P10 {

}

class Pet{
	private String type;
	public Pet(String type){
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}

class Dog extends Pet{
	public Dog() {
		super("dog");
	}
}

class Cat extends Pet{
	public Cat() {
		super("cat");
	}
}


class PetEnterQueue{
	private Pet pet;
	private long count;
	public PetEnterQueue(Pet pet, long count){
		this.pet = pet;
		this.count = count;
	}
	
	public long getCount() {
		return count;
	}
	
	public Pet getPet() {
		return pet;
	}
	
	public String getEnterPetType(){
		return this.pet.getType();
	}
	
}


class DogCatQueue{
	private Queue<PetEnterQueue> dogQ;
	private Queue<PetEnterQueue> catQ;
	private long count;
	public DogCatQueue(){
		this.dogQ = new LinkedList<>();
		this.catQ = new LinkedList<>();
		this.count = 0;
	}
	
	public void add(Pet pet){
		if(pet.getType().equals("dog")){
			this.dogQ.add(new PetEnterQueue(pet, count++));
		}else if(pet.getType().equals("cat")){
			this.catQ.add(new PetEnterQueue(pet, count++));
		}else{
			throw new RuntimeException("error,not dog or cat");
		}
	}
	
	public Pet pollAll(){
			if(!this.dogQ.isEmpty() && !this.catQ.isEmpty()){
				if(this.dogQ.peek().getCount() > this.catQ.peek().getCount())
					return this.catQ.poll().getPet();
				else
					return this.dogQ.poll().getPet();
			}else if(this.dogQ.isEmpty() && !this.catQ.isEmpty())
				return this.catQ.poll().getPet();
			else if(!this.dogQ.isEmpty() && this.catQ.isEmpty())
				return this.dogQ.poll().getPet();
			else{
				throw new RuntimeException("error,queue is empty!");
			}
	}
	
	
}