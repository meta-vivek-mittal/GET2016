package pf1;

public class Assignment4{

	public int[][] FCFS(int arrival_time[] , int job_size[]) 
   {

	int j=0;
	//declare a 2-D array of dimension (arrival_time x 3 )
	int FCFSOut[][]=new int[arrival_time.length][5];

	while(j < arrival_time.length){
		
		FCFSOut[j][0]=j+1;
		FCFSOut[j][1]=arrival_time[j];

	if(j == 0)				    //when machine starts to execute the very first process
	{
		FCFSOut[j][2] = 0;
		FCFSOut[j][3] = 1;
		FCFSOut[j][4] = job_size[j];
	}

	else if(arrival_time[j] > FCFSOut[j-1][4])  //when some process arrived before completion of previous one.
	{

		FCFSOut[j][2] = 0;
		FCFSOut[j][3] = arrival_time[j];
		FCFSOut[j][4] = arrival_time[j] + job_size[j] - 1;
		
	}

	else					    //When machine is in idle condition		
	{
		FCFSOut[j][2] = FCFSOut[j-1][4] - arrival_time[j] + 1;
		FCFSOut[j][3] = FCFSOut[j-1][4] + 1;
		FCFSOut[j][4] = FCFSOut[j][3] + job_size[j]-1;
	}

	j++;
	}
	return FCFSOut;
    }


        public static void main(String args[])
    {
	int arrival_time[] = {1,5,9,25};
	int job_size[] = {12,7,2,5};
	
	int FCFSOut[][] =  new Assignment4().FCFS(arrival_time,job_size);
	
	System.out.println("Job \t Job Arrival Time\t Job wait time\t Job Start At\t Job Finish Time\n");
	for(int i=0 ; i < arrival_time.length ; i++)
	{
		for(int j=0 ; j < 5 ; j++)
		{
			System.out.print( "  "+FCFSOut[i][j] + "\t\t");
		}
		System.out.println();
	}
    }
}








