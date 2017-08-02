package tv;

public class TV 
{
	private int channel;
	private int volume;
	private boolean power;
	
	// 생성자
	public TV() {}
	
	public TV(int ch, int vol, boolean pw)
	{
		this.channel = ch;
		this.volume = vol;
		this.power = pw;
	}
	
	// getter
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}

	// power ON/OFF
	public void power(boolean on)
	{
		this.power = on;
	}
	
	// 채널 설정
	public void channel(int ch)
	{
		if(ch > 0 && ch <= 255)
			this.channel = ch;
		else 
			System.out.println("Channel은 1~255까지 설정할 수 있습니다.");
	}
	
	// 채널 증감
	public void channel(boolean up)
	{
		if(up)
		{
			if(this.channel < 255) this.channel++;
			else this.channel = 1;
		}
		else if(!up && this.channel > 1) 
			this.channel--;
	}
	
	// 볼륨 설정
	public void volume(int vol)
	{
		if(vol > -1 && vol <= 100)
			this.volume = vol;
		else 
			System.out.println("Volume은 0~100까지 설정할 수 있습니다.");
	}
	
	// 볼륨 증감
	public void volume(boolean up)
	{
		if(up)
			if(this.volume < 100) this.volume++;
		else if(this.volume > 0) 
			this.channel--;
	}
		
	// TV 정보 출력
	public void status()
	{
		System.out.println("TV Power = " + this.power);
		System.out.println("TV channel = " + this.channel);
		System.out.println("TV volume = " + this.volume);
	}
}
