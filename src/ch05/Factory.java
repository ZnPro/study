package ch05;

public abstract class Factory {
//	protected abstract void 색칠(); /protected : 자식만 찾을 수 있게 해준다.
	protected void 건조() {
		System.out.println("건조 완료");
	}
	public void 가동() {
		//색칠();
		건조();
	}
}
