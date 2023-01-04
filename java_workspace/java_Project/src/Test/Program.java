package Test;

public class Program {
    public static void main(String[] args) {
        Card2 c = new Card2();
        CardPack2 cp = new CardPack2();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                Card2 tmp = cp.pick();
                tmp.print();
            }
            System.out.println();
        }

    }
}
class Card2 {
    private int num; // 숫자
    private char shape; // 모양

    public Card2() {
        num = 1;
        shape = '♥';
    }

    public void print() {
        System.out.print(shape);
        switch (num) {
            case 1:
                System.out.print("A ");
                break;
            case 11:
                System.out.print("J ");
                break;
            case 12:
                System.out.print("Q ");
                break;
            case 13:
                System.out.print("K ");
                break;
            default:
                System.out.print(num + " ");
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        if (num < 1 || num > 13) {
            this.num = 1;
        } else {
            this.num = num;
        }
    }

    public char getShape() {
        return shape;
    }

    public void setShape(char shape) {
        switch (shape) {
            case '♥':
            case '◆':
            case '♣':
            case '♠':
                this.shape = shape;
                break;
            default:
                this.shape = '♥';
        }
    }
}

class CardPack2 {
    private Card2[] pack = new Card2[52];
    private int cnt = 0;

    public Card2 pick() {
        if (cnt == 0) {
            return null;
        }
        cnt--;
        return pack[cnt];
    }

    public CardPack2() {
        char shape = '♥';
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    shape = '♥';
                    break;
                case 2:
                    shape = '◆';
                    break;
                case 3:
                    shape = '♣';
                    break;
                case 4:
                    shape = '♠';
                    break;
            }
            for (int j = 1; j <= 13; j++) {
                Card2 tmp = new Card2();
                tmp.setNum(j);
                tmp.setShape(shape);
                pack[cnt] = tmp;
                cnt++;
            }
        }
    }
}