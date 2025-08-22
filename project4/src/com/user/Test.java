package com.user;

import java.util.Scanner;

import com.service.EVM;

public class Test {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		EVM evm=new EVM();
		evm.Candidatereg();
		System.out.println("---------------Welcome To Online Election System-------------------");
		while(true) 
		{
		System.out.println("1:Voter Registaration \n2:Show Voter List \n3:To vote \n4:Show Winner");	
		System.out.println("what do you want to do?");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			evm.voterReg();
			break;
		case 2:
			evm.displyVoter();
			break;
		case 3:
			evm.vote();
			break;
		case 4:
			evm.result();
			break;
		case 5:
			System.exit(1);
			break;
		default:
			System.err.println("Invalid choise !!!!!!");
			break;
		}
		}	
	}

}
