package ch02;

import java.util.Scanner;

// 조건을 판단하고 처리할 때 사용하는 문법
public class IfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 이름 입력 받기
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        // 스캐너로 키보드로 입력하게 만듦

        // 성적 입력 받기
        System.out.println(name + "님 성적을 반드시 숫자로 입력하세요 : ");

        // System 에서 입력을 받으므로 in

        // 성적이 60점 이상이면 합격, 불합격
        // 스캐너로부터 성적입력 받기
        int score = sc.nextInt();
        // 삼항 연산
        System.out.println(score >= 60 ? "합격" : "불합격");

        // If 구문
        if (score >= 60) {
            System.out.println("축하합니다");
            // 만약에 75를 입력 -> 15점을 더 획득했네요.
            System.out.println((score - 60) + "점을 더 획득했네요");
        } else {
            System.out.println("다음 기회에...");
            // 만약에 55를 입력 -> 5점 부족해요..
            System.out.println((60 - score) + "점 부족해요...");
        }
        }
    }

