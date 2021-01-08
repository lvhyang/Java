package ninepointsix;
import java.util.Date;
import java.util.Random;
public class ninepointsix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int min;
		int i;
		final int NUMBER = 100000;
		int[] number = new int[NUMBER];
		Random random = new Random();
		for (i = 0; i < NUMBER; i++) {
			number[i] = random.nextInt(100000);
		}
		StopWatch stopWatch = new StopWatch();
        for (i = 0; i < 100000; i++)
        {
            min = i;
            for(int j = i + 1; j < 100000 ; j++) {
                if (number[j] < number[min]) {
                	min = j;
                }
            temp = number[min];
            number[min] = number[i];
            number[i] = temp;
            }
        }
		stopWatch.stop();		
		System.out.println(stopWatch.getElapsedTime() + "ms");		
	}
}

class StopWatch {
	private Date startTime;
	private Date endTime;
	public StopWatch() {
		startTime = new Date();
	}
	
	public void start() {
		startTime = new Date();
	}
	
	public void stop() {
		endTime = new Date();
	}
	
	public long getElapsedTime() {
		return endTime.getTime() - startTime.getTime();
	}

	public Date getStartTime() {
		return startTime;
	}

	public Date getEndTime() {
		return endTime;
	}
}
	


