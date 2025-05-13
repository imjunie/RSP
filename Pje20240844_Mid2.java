import java.util.Scanner;
import java.util.Random;

public class Pje20240844_Mid2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("리셋 가위바위보.");
        System.out.println("가위바위보에서 이기면 +2점, 지면 점수는 0점으로 리셋된다. 게임을 종료하고 싶다면 'e'를 입력하시오.");

        int score = 0;  // 점수 초기화
        System.out.println("현재 점수: " + score);
        System.out.println("게임을 시작합니다.");

        while (true) {
            System.out.println("\n------------------------------------------------");
            System.out.println("안 내면 진다. 가위, 바위, 보");
            System.out.print("가위, 바위, 보 중 하나 선택 하시오. : ");
            String myChoice = sc.nextLine();

            if (myChoice.equals("e")) {
                System.out.println("게임을 종료합니다.");
                System.out.println("마지막 점수는: " + score + " 점 입니다.");
                break;
            }

            if (myChoice.equals("가위") || myChoice.equals("바위") || myChoice.equals("보")) {
                int ranChoice = random.nextInt(3); // 0~2 정수 출력
                String comChoice = "";
                
                if (ranChoice == 0) {
                    comChoice = "바위";
                } else if (ranChoice == 1) {
                    comChoice = "보";
                } else {
                    comChoice = "가위";
                } // 숫자로 나오는 랜덤값을 가위 바위 보로 변환=> 0: 바위, 1: 보, 2: 가위

                if (ranChoice == 0) {
                    if (myChoice.equals("보")) {
                        score += 2;
                        System.out.println("You Win!! Computer:" + comChoice + ", You:" + myChoice + ". Score: " + score);
                    } else if (myChoice.equals("가위")) {
                        score = 0;
                        System.out.println("You Lose... Computer:" + comChoice + ", You:" + myChoice + ". Score: " + score);
                    } else {
                        // myChoice == "바위"
                        score = score;  // 점수 유지
                        System.out.println("It's a Draw! Computer:" + comChoice + ", You:" + myChoice + ". Score: " + score);
                    }

                } else if (ranChoice == 1) {
                    if (myChoice.equals("가위")) {
                        score += 2;
                        System.out.println("You Win!! Computer:" + comChoice + ", You:" + myChoice + ". Score: " + score);
                    } else if (myChoice.equals("바위")) {
                        score = 0;
                        System.out.println("You Lose... Computer:" + comChoice + ", You:" + myChoice + ". Score: " + score);
                    } else {
                        // myChoice == "보"
                        score = score;
                        System.out.println("It's a Draw! Computer:" + comChoice + ", You:" + myChoice + ". Score: " + score);
                    }

                } else {
                    // ranChoice == 2
                    if (myChoice.equals("바위")) {
                        score += 2;
                        System.out.println("You Win!! Computer:" + comChoice + ", You:" + myChoice + ". Score: " + score);
                    } else if (myChoice.equals("보")) {
                        score = 0;
                        System.out.println("You Lose... Computer:" + comChoice + ", You:" + myChoice + ". Score: " + score);
                    } else {
                        // myChoice == "가위"
                        score = score;
                        System.out.println("It's a Draw! Computer:" + comChoice + ", You:" + myChoice + ". Score: " + score); 
                    }
                }

            } else {
                System.out.println("\n------------------------------------------------");
                System.out.println("올바른 값을 입력하시오. 가위 바위 보 중에 똑바로 고르세요.");
                continue;
            }
        }

        sc.close();
    }
}