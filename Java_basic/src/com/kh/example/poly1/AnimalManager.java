package com.kh.example.poly1;

public class AnimalManager {
	public static void main (String[] args) {
		Animal[] aniArr = new Animal[5];
		aniArr[0] = new Dog("구름이", 2, "푸들");
		aniArr[1] = new Dog("먼지", 8, "포메라니안");
		aniArr[2] = new Cat("솜털", 4, "흰색");
		aniArr[3] = new Dog("멍이", 9, "불독");
		aniArr[4] = new Cat("개냥이", 10, "갈색");
		
		for (Animal ani : aniArr) {
			if (ani == null) {
				break;
			} else {
				ani.speak();
				if (ani instanceof Dog) {
					System.out.println("이 개의 견종은 " + ((Dog)ani).getBreed() + "입니다.");
				} else if (ani instanceof Cat) {
					System.out.println("이 고양이의 색상은 " + ((Cat)ani).getColor() + "입니다.");
				}
				System.out.println();
			}
		}
		
		
		
	}

}
