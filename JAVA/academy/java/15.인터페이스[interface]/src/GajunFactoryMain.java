
public class GajunFactoryMain {

	public static void main(String[] args) {
		/***************가전제품공장************************/
		System.out.println("-------------------------가전제품공장-------------------------------");
		GajunTV tv1=new GajunTV();
		GajunTV tv2=new GajunTV();
		GajunTV tv3=new GajunTV();
		GajunAudio audio1=new GajunAudio();
		GajunAudio audio2=new GajunAudio();
		GajunSmartPhone phone1=new GajunSmartPhone();
		GajunSmartPhone phone2=new GajunSmartPhone();
		GajunMP3 mp1=new GajunMP3();
		
		GajunOnOff gajun1 = tv1;
		GajunOnOff[] gajunArray=new GajunOnOff[8];
		gajunArray[0]=tv1;
		gajunArray[1]=tv2;
		gajunArray[2]=tv3;
		gajunArray[3]=audio1;
		gajunArray[4]=audio2;
		gajunArray[5]=phone1;
		gajunArray[6]=phone2;
		gajunArray[7]=mp1;
		
		GajunGumsa gajunGumsa=new GajunGumsa();
		gajunGumsa.setGajuns(gajunArray);
		gajunGumsa.gumsa();
		/***************가전제품 OnOff,볼륨작동 검사소************************/
		/*
		System.out.println("-------------------------가전제품 OnOff,볼륨작동 검사소-------------------------------");
		/*
		난 절대로 자식클래스타입을 사용안할래요.
		난 부모타입[GajunOnOff,GajunVolume]만 사용할래요.
		그래야 가전검사 프로그램 한번만들어서 변경없이 계속사용할수있으니까요.
		*/
		/*
		GajunOnOff[] recvGajunArray = gajunArray;
		for (int i = 0; i < recvGajunArray.length; i++) {
			recvGajunArray[i].on();
			GajunVolume tempGajun=(GajunVolume)recvGajunArray[i];
			tempGajun.up();
			tempGajun.down();
			recvGajunArray[i].off();
			System.out.println("--------검사끝 출고-------");
		}
		*/
	}
}
