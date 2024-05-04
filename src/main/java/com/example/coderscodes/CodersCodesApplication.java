package com.example.coderscodes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CodersCodesApplication {

//	Expected Output :
//	Hello
//	Alexandra Abramov

	public static void main(String[] args) {
//		"3"+"5" = "35"
		Scanner scanner = new Scanner(System.in);
		int num1 ,num2 ;
		System.out.println("Zehmet olmsa iki eded daxil edin:");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		int sum = num1 + num2;
		// 5 + 7 = 12
		System.out.println(num1+"+"+num2+"="+sum);

//		byte age;
//		short birthDate;
//		String name ;
//
//		System.out.print("Adinizi daxil edin:");
//		name = scanner.nextLine();
//		System.out.println("dogum ilinizi daxil edin:");
//		birthDate = scanner.nextShort();
//		age =(byte)(2024 - birthDate);
//		System.out.print("Hello\n"+name+" sizin yasiniz "+age);
//				System.out.print("Hello\n");
//		System.out.println("Teyyub Aliyev");
//		System.out.println("Hello");
//		System.out.println("Teyyub Aliyev");
//		SpringApplication.run(CodersCodesApplication.class, args);
	}

}
