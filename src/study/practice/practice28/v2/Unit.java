package study.practice.practice28.v2;

public abstract class Unit {
	int x, y; // 현재 위치
	abstract void move(int x, int y); 
	void stop() { /* 현재 위치에 정지 */ }  
}

