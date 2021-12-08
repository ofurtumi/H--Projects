# "svindlblað" f/ töl-101

## helstu Math föll
| fall | útkoma |
| --- | --- |
| .abs(a) | skilar algildi |
| .min(a,b)/max(a,b) | skila stærra/minna gildinu |
| .exp(a) | skilar e í veldi a |
| .pow(a,b) | skilar a í veldi b |
| .random() | skilar ranom tölu frá og með 0 að 1 |
| .sqrt(a) | skilar rót af a |
### Math fastar
| --- | --- |
| .E | 2.178... |
| .PI | 3.141... |

## casting
þegar verið er að casta, (int)3.14, passa að verið sé að casta öllu sem á við
- (int)10.25+7.98) == 17.98
- (int)10.25+(int)7.98) == 17
- (int)(10.25+7.98) == 18

## switch ritháttur

    switch (key) {
        case value:
            function();
            break;

        default:
            break;
    }

## hækkun/lækkun breyta
innanlínu breytivirkjar, ++ og -- eru pain, látum i = 5
- System.out.printf("i fyrir hækkun: %d, i eftir hækkun: %d",i++,i)
    - þetta skilar: i fyrir hækkun: 5, i eftir hækkun 6 
    - i skilar gildinu 5 og hækkar svo því ++ er eftir i
- System.out.printf("i fyrir hækkun: %d, i eftir hækkun: %d",i,++i)
    - þetta skilar því sama, vegna þess að hér er ++ á undan i
- þetta virkar svo alveg eins með --

## scanner
Scanner my beloved baby boy,
syntax fyrir scanner væri:

    import java.util.Scanner;
    Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);

til að fá ótilgreindan fjölda af gögnum inn, nota 

    while(s.hasNext())


