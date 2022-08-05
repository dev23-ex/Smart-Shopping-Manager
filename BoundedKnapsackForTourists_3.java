// v == weight
// w == value
import java.util.*;
import java.text.*;
import javax.swing.*;
import javax.swing.JOptionPane;

 class BoundedKnapsackForTourists_3 {
    public BoundedKnapsackForTourists_3() {
    
    int  v= 0;
    int v1= 0;
    int  v2= 0;
    int  v3= 0; int  v4= 0; int  v5= 0; int  v6= 0; int  v7= 0;  int  v8= 0; int  v9= 0; int  v10= 0; int  v11= 0; int  v12= 0; int  v13= 0; 
    String budget = JOptionPane.showInputDialog("enter the budget =    ");
        int b1 = Integer.parseInt(budget);
           BoundedKnapsack bok = new BoundedKnapsack(b1); // 400 dkg = 400 dag = 4 kg
 
        // making the list of items that you want to bring
        
        String i = JOptionPane.showInputDialog("enter the item =    ");
        
        if( i.equals("examination pad") || i.equals("file divider")|| i.equals("filpfile 20pg")|| i.equals("scissor medium") || i.equals("file divider carboard")) {v=16;}

        if( i.equals("a4 hard cover 72 pages") || i.equals("portfolio file")) {v=6;}
        if( i.equals("a4 hard cover 96 pages")) {v=14;}
        if( i.equals("a4 hard cover 192 pages") || i.equals("a4 hard cover 192 pages qad book") ) {v=22;}
        if( i.equals("a4 hard cover 288 pages")) {v=29;}
        if( i.equals("book cover a4")) {v=37;}
        if( i.equals("a3 cardboard")) {v=4;}
       
        if( i.equals("a3 photostat paper")) {v=1;}
        if( i.equals("cartidge paper a3") || i.equals("a4 cardboard")) {v=2;}
        if( i.equals("carry case")) {v=170;}
        if( i.equals("calculator casio plus")) {v=320;}
        if( i.equals("a4 document wallet") || i.equals("file sleeve 10") || i.equals("highlighter") || i.equals("bic click pen")) {v=8;}
        if( i.equals("envelop a3") || i.equals("eraser") || i.equals("pencil") || i.equals("clck pen") || i.equals("rulers 30cm") || i.equals("sharpener metal") ) {v=5;}
        if( i.equals("putty eraser") || i.equals("flipfile 30pg") || i.equals("paint brush 8/10") || i.equals("scissor large") ) {v=20;}
        if( i.equals("file divider pvc")) {v=18;}
        if( i.equals("file liver arch 40mm")) {v=24;}
        if( i.equals("file liver arch 70mm")) {v=26;}
        if( i.equals("ringbinder file")) {v=17;}
        if( i.equals("flipfile 50pg") || i.equals("punch")) {v=35;}
        if( i.equals("pack of book labels") || i.equals("ruler 15") ) {v=3;}
        if( i.equals("masking tape 12mm")) {v=9;}
        if( i.equals("paint 6 color set")) {v=105;}
        
        if( i.equals("paint brush 4/6")) {v=13;}
        if( i.equals("paint brush 1/2")) {v=10;}
        if( i.equals("long paint brushes")) {v=40;}
        if( i.equals("palette 6 well") || i.equals("clutch pencil") || i.equals("tippex") ) {v=15;}
        if( i.equals("clutch pencil hb led 0.5") || i.equals("protractor 10cm") ) {v=7;}
        if( i.equals("tippex pen") || i.equals("protractor 15cm") ) {v=12;}
        if( i.equals("set square 25cm 30/60") || i.equals("set square 25cm 45/90") ) {v=25;}
        if( i.equals("a4 visual diary 150pg")) {v=90;}
        if( i.equals("a2 source book")) {v=165;}
        if( i.equals("tur dal 1kg") || i.equals("moong dal 1kg") ) {v=99;}
        if( i.equals("tur dal premium 1kg")) {v=112;}
        if( i.equals("premia groundnut 500g")) {v=69;}
        if( i.equals("moong whole 1kg")) {v=107;}
        if( i.equals("chana dal 1kg")) {v=82;}
        if( i.equals("kabuli dal 500g")) {v=49;}
        if( i.equals("urad dal 500g")) {v=54;}
        if( i.equals("masoor dal 1kg")) {v=78;}
        if( i.equals("badam 500g")) {v=405;}
        if( i.equals("akrod magaj 100g")) {v=162;}
        if( i.equals("kaju 500g")) {v=520;}
        if( i.equals("anjeer")) {v=114;}
        if( i.equals("makhana 100g")) {v=250;}
        if( i.equals("wheat flour 1kg")) {v=36;}
        if( i.equals("besan 500g")) {v=38;}
        if( i.equals("dates 500g")) {v=119;}
 
        String value = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w = Integer.parseInt(value);
           
        String unit = JOptionPane.showInputDialog("enter the unit =    ");
        int u = Integer.parseInt(unit);

        	
        
        String i1 = JOptionPane.showInputDialog("enter the item =    ");
        if( i1.equals("examination pad") || i1.equals("file divider")|| i1.equals("filpfile 20pg")|| i1.equals("scissor medium") || i1.equals("file divider carboard")) {v=16;}

        if( i1.equals("a4 hard cover 72 pages") || i1.equals("portfolio file")) {v=6;}
        if( i1.equals("a4 hard cover 96 pages")) {v=14;}
        if( i1.equals("a4 hard cover 192 pages") || i1.equals("a4 hard cover 192 pages qad book") ) {v=22;}
        if( i1.equals("a4 hard cover 288 pages")) {v=29;}
        if( i1.equals("book cover a4")) {v=37;}
        if( i1.equals("a3 cardboard")) {v=4;}
       
        if( i1.equals("a3 photostat paper")) {v=1;}
        if( i1.equals("cartidge paper a3") || i1.equals("a4 cardboard")) {v=2;}
        if( i1.equals("carry case")) {v=170;}
        if( i1.equals("calculator casio plus")) {v=320;}
        if( i1.equals("a4 document wallet") || i1.equals("file sleeve 10") || i1.equals("highlighter") || i1.equals("bic click pen")) {v=8;}
        if( i1.equals("envelop a3") || i1.equals("eraser") || i1.equals("pencil") || i1.equals("clck pen") || i1.equals("rulers 30cm") || i1.equals("sharpener metal") ) {v=5;}
        if( i1.equals("putty eraser") || i1.equals("flipfile 30pg") || i1.equals("paint brush 8/10") || i1.equals("scissor large") ) {v=20;}
        if( i1.equals("file divider pvc")) {v=18;}
        if( i1.equals("file liver arch 40mm")) {v=24;}
        if( i1.equals("file liver arch 70mm")) {v=26;}
        if( i1.equals("ringbinder file")) {v=17;}
        if( i1.equals("flipfile 50pg") || i1.equals("punch")) {v=35;}
        if( i1.equals("pack of book labels") || i1.equals("ruler 15") ) {v=3;}
        if( i1.equals("masking tape 12mm")) {v=9;}
        if( i1.equals("paint 6 color set")) {v=105;}
        
        if( i1.equals("paint brush 4/6")) {v=13;}
        if( i1.equals("paint brush 1/2")) {v=10;}
        if( i1.equals("long paint brushes")) {v=40;}
        if( i1.equals("palette 6 well") || i1.equals("clutch pencil") || i1.equals("tippex") ) {v=15;}
        if( i1.equals("clutch pencil hb led 0.5") || i1.equals("protractor 10cm") ) {v=7;}
        if( i1.equals("tippex pen") || i1.equals("protractor 15cm") ) {v=12;}
        if( i1.equals("set square 25cm 30/60") || i1.equals("set square 25cm 45/90") ) {v=25;}
        if( i1.equals("a4 visual diary 150pg")) {v=90;}
        if( i1.equals("a2 source book")) {v=165;}
        if( i1.equals("tur dal 1kg") || i1.equals("moong dal 1kg") ) {v=99;}
        if( i1.equals("tur dal premium 1kg")) {v=112;}
        if( i1.equals("premia groundnut 500g")) {v=69;}
        if( i1.equals("moong whole 1kg")) {v=107;}
        if( i1.equals("chana dal 1kg")) {v=82;}
        if( i1.equals("kabuli dal 500g")) {v=49;}
        if( i1.equals("urad dal 500g")) {v=54;}
        if( i1.equals("masoor dal 1kg")) {v=78;}
        if( i1.equals("badam 500g")) {v=405;}
        if( i1.equals("akrod magaj 100g")) {v=162;}
        if( i1.equals("kaju 500g")) {v=520;}
        if( i1.equals("anjeer")) {v=114;}
        if( i1.equals("makhana 100g")) {v=250;}
        if( i1.equals("wheat flour 1kg")) {v=36;}
        if( i1.equals("besan 500g")) {v=38;}
        if( i1.equals("dates 500g")) {v=119;}
        
        String value1 = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w1 = Integer.parseInt(value1);
        
        String unit1 = JOptionPane.showInputDialog("enter the unit =    ");
        int u1 = Integer.parseInt(unit1);
        
        
        
        String i2 = JOptionPane.showInputDialog("enter the item =    ");
        if( i2.equals("examination pad") || i2.equals("file divider")|| i2.equals("filpfile 20pg")|| i2.equals("scissor medium") || i2.equals("file divider carboard")) {v2=16;}

        if( i2.equals("a4 hard cover 72 pages") || i2.equals("portfolio file")) {v2=6;}
        if( i2.equals("a4 hard cover 96 pages")) {v2=14;}
        if( i2.equals("a4 hard cover 192 pages") || i2.equals("a4 hard cover 192 pages qad book") ) {v2=22;}
        if( i2.equals("a4 hard cover 288 pages")) {v2=29;}
        if( i2.equals("book cover a4")) {v2=37;}
        if( i2.equals("a3 cardboard")) {v2=4;}
       
        if( i2.equals("a3 photostat paper")) {v2=1;}
        if( i2.equals("cartidge paper a3") || i2.equals("a4 cardboard")) {v2=2;}
        if( i2.equals("carry case")) {v2=170;}
        if( i2.equals("calculator casio plus")) {v2=320;}
        if( i2.equals("a4 document wallet") || i2.equals("file sleeve 10") || i2.equals("highlighter") || i2.equals("bic click pen")) {v2=8;}
        if( i2.equals("envelop a3") || i2.equals("eraser") || i2.equals("pencil") || i2.equals("clck pen") || i2.equals("rulers 30cm") || i2.equals("sharpener metal") ) {v2=5;}
        if( i2.equals("putty eraser") || i2.equals("flipfile 30pg") || i2.equals("paint brush 8/10") || i2.equals("scissor large") ) {v2=20;}
        if( i2.equals("file divider pvc")) {v2=18;}
        if( i2.equals("file liver arch 40mm")) {v2=24;}
        if( i2.equals("file liver arch 70mm")) {v2=26;}
        if( i2.equals("ringbinder file")) {v2=17;}
        if( i2.equals("flipfile 50pg") || i2.equals("punch")) {v2=35;}
        if( i2.equals("pack of book labels") || i2.equals("ruler 15") ) {v2=3;}
        if( i2.equals("masking tape 12mm")) {v2=9;}
        if( i2.equals("paint 6 color set")) {v2=105;}
        
        if( i2.equals("paint brush 4/6")) {v2=13;}
        if( i2.equals("paint brush 1/2")) {v2=10;}
        if( i2.equals("long paint brushes")) {v2=40;}
        if( i2.equals("palette 6 well") || i2.equals("clutch pencil") || i2.equals("tippex") ) {v2=15;}
        if( i2.equals("clutch pencil hb led 0.5") || i2.equals("protractor 10cm") ) {v2=7;}
        if( i2.equals("tippex pen") || i2.equals("protractor 15cm") ) {v2=12;}
        if( i2.equals("set square 25cm 30/60") || i2.equals("set square 25cm 45/90") ) {v2=25;}
        if( i2.equals("a4 visual diary 150pg")) {v2=90;}
        if( i2.equals("a2 source book")) {v2=165;}
        if( i2.equals("tur dal 1kg") || i2.equals("moong dal 1kg") ) {v2=99;}
        if( i2.equals("tur dal premium 1kg")) {v2=112;}
        if( i2.equals("premia groundnut 500g")) {v2=69;}
        if( i2.equals("moong whole 1kg")) {v2=107;}
        if( i2.equals("chana dal 1kg")) {v2=82;}
        if( i2.equals("kabuli dal 500g")) {v2=49;}
        if( i2.equals("urad dal 500g")) {v2=54;}
        if( i2.equals("masoor dal 1kg")) {v2=78;}
        if( i2.equals("badam 500g")) {v2=405;}
        if( i2.equals("akrod magaj 100g")) {v2=162;}
        if( i2.equals("kaju 500g")) {v2=520;}
        if( i2.equals("anjeer")) {v2=114;}
        if( i2.equals("makhana 100g")) {v2=250;}
        if( i2.equals("wheat flour 1kg")) {v2=36;}
        if( i2.equals("besan 500g")) {v2=38;}
        if( i2.equals("dates 500g")) {v2=119;}
        
        String value2 = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w2 = Integer.parseInt(value2);
        
        String unit2 = JOptionPane.showInputDialog("enter the unit =    ");
        int u2 = Integer.parseInt(unit2);
        
        
        String i3 = JOptionPane.showInputDialog("enter the item =    ");
        if( i3.equals("examination pad") || i3.equals("file divider")|| i3.equals("filpfile 20pg")|| i3.equals("scissor medium") || i3.equals("file divider carboard")) {v3=16;}

        if( i3.equals("a4 hard cover 72 pages") || i3.equals("portfolio file")) {v3=6;}
        if( i3.equals("a4 hard cover 96 pages")) {v3=14;}
        if( i3.equals("a4 hard cover 192 pages") || i3.equals("a4 hard cover 192 pages qad book") ) {v3=22;}
        if( i3.equals("a4 hard cover 288 pages")) {v3=29;}
        if( i3.equals("book cover a4")) {v3=37;}
        if( i3.equals("a3 cardboard")) {v3=4;}
       
        if( i3.equals("a3 photostat paper")) {v3=1;}
        if( i3.equals("cartidge paper a3") || i3.equals("a4 cardboard")) {v3=2;}
        if( i3.equals("carry case")) {v3=170;}
        if( i3.equals("calculator casio plus")) {v3=320;}
        if( i3.equals("a4 document wallet") || i3.equals("file sleeve 10") || i3.equals("highlighter") || i3.equals("bic click pen")) {v3=8;}
        if( i3.equals("envelop a3") || i3.equals("eraser") || i3.equals("pencil") || i3.equals("clck pen") || i3.equals("rulers 30cm") || i3.equals("sharpener metal") ) {v3=5;}
        if( i3.equals("putty eraser") || i3.equals("flipfile 30pg") || i3.equals("paint brush 8/10") || i3.equals("scissor large") ) {v3=20;}
        if( i3.equals("file divider pvc")) {v3=18;}
        if( i3.equals("file liver arch 40mm")) {v3=24;}
        if( i3.equals("file liver arch 70mm")) {v3=26;}
        if( i3.equals("ringbinder file")) {v3=17;}
        if( i3.equals("flipfile 50pg") || i3.equals("punch")) {v3=35;}
        if( i3.equals("pack of book labels") || i3.equals("ruler 15") ) {v3=3;}
        if( i3.equals("masking tape 12mm")) {v3=9;}
        if( i3.equals("paint 6 color set")) {v3=105;}
        
        if( i3.equals("paint brush 4/6")) {v3=13;}
        if( i3.equals("paint brush 1/2")) {v3=10;}
        if( i3.equals("long paint brushes")) {v3=40;}
        if( i3.equals("palette 6 well") || i3.equals("clutch pencil") || i3.equals("tippex") ) {v3=15;}
        if( i3.equals("clutch pencil hb led 0.5") || i3.equals("protractor 10cm") ) {v3=7;}
        if( i3.equals("tippex pen") || i3.equals("protractor 15cm") ) {v3=12;}
        if( i3.equals("set square 25cm 30/60") || i3.equals("set square 25cm 45/90") ) {v3=25;}
        if( i3.equals("a4 visual diary 150pg")) {v3=90;}
        if( i3.equals("a2 source book")) {v3=165;}
        if( i3.equals("tur dal 1kg") || i3.equals("moong dal 1kg") ) {v3=99;}
        if( i3.equals("tur dal premium 1kg")) {v3=112;}
        if( i3.equals("premia groundnut 500g")) {v3=69;}
        if( i3.equals("moong whole 1kg")) {v3=107;}
        if( i3.equals("chana dal 1kg")) {v3=82;}
        if( i3.equals("kabuli dal 500g")) {v3=49;}
        if( i3.equals("urad dal 500g")) {v3=54;}
        if( i3.equals("masoor dal 1kg")) {v3=78;}
        if( i3.equals("badam 500g")) {v3=405;}
        if( i3.equals("akrod magaj 100g")) {v3=162;}
        if( i3.equals("kaju 500g")) {v3=520;}
        if( i3.equals("anjeer")) {v3=114;}
        if( i3.equals("makhana 100g")) {v3=250;}
        if( i3.equals("wheat flour 1kg")) {v3=36;}
        if( i3.equals("besan 500g")) {v3=38;}
        if( i3.equals("dates 500g")) {v3=119;}
        
        String value3 = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w3 = Integer.parseInt(value3);
        
        String unit3 = JOptionPane.showInputDialog("enter the unit =    ");
        int u3 = Integer.parseInt(unit3);
        
        String i4 = JOptionPane.showInputDialog("enter the item =    ");
        if( i4.equals("examination pad") || i4.equals("file divider")|| i4.equals("filpfile 20pg")|| i4.equals("scissor medium") || i4.equals("file divider carboard")) {v4=16;}

        if( i4.equals("a4 hard cover 72 pages") || i4.equals("portfolio file")) {v4=6;}
        if( i4.equals("a4 hard cover 96 pages")) {v4=14;}
        if( i4.equals("a4 hard cover 192 pages") || i4.equals("a4 hard cover 192 pages qad book") ) {v4=22;}
        if( i4.equals("a4 hard cover 288 pages")) {v4=29;}
        if( i4.equals("book cover a4")) {v4=37;}
        if( i4.equals("a3 cardboard")) {v4=4;}
       
        if( i4.equals("a3 photostat paper")) {v4=1;}
        if( i4.equals("cartidge paper a3") || i4.equals("a4 cardboard")) {v4=2;}
        if( i4.equals("carry case")) {v4=170;}
        if( i4.equals("calculator casio plus")) {v4=320;}
        if( i4.equals("a4 document wallet") || i4.equals("file sleeve 10") || i4.equals("highlighter") || i4.equals("bic click pen")) {v4=8;}
        if( i4.equals("envelop a3") || i4.equals("eraser") || i4.equals("pencil") || i4.equals("clck pen") || i4.equals("rulers 30cm") || i4.equals("sharpener metal") ) {v4=5;}
        if( i4.equals("putty eraser") || i4.equals("flipfile 30pg") || i4.equals("paint brush 8/10") || i4.equals("scissor large") ) {v4=20;}
        if( i4.equals("file divider pvc")) {v4=18;}
        if( i4.equals("file liver arch 40mm")) {v4=24;}
        if( i4.equals("file liver arch 70mm")) {v4=26;}
        if( i4.equals("ringbinder file")) {v4=17;}
        if( i4.equals("flipfile 50pg") || i4.equals("punch")) {v4=35;}
        if( i4.equals("pack of book labels") || i4.equals("ruler 15") ) {v4=3;}
        if( i4.equals("masking tape 12mm")) {v4=9;}
        if( i4.equals("paint 6 color set")) {v4=105;}
        
        if( i4.equals("paint brush 4/6")) {v4=13;}
        if( i4.equals("paint brush 1/2")) {v4=10;}
        if( i4.equals("long paint brushes")) {v4=40;}
        if( i4.equals("palette 6 well") || i4.equals("clutch pencil") || i4.equals("tippex") ) {v4=15;}
        if( i4.equals("clutch pencil hb led 0.5") || i4.equals("protractor 10cm") ) {v4=7;}
        if( i4.equals("tippex pen") || i4.equals("protractor 15cm") ) {v4=12;}
        if( i4.equals("set square 25cm 30/60") || i4.equals("set square 25cm 45/90") ) {v4=25;}
        if( i4.equals("a4 visual diary 150pg")) {v4=90;}
        if( i4.equals("a2 source book")) {v4=165;}
        if( i4.equals("tur dal 1kg") || i4.equals("moong dal 1kg") ) {v4=99;}
        if( i4.equals("tur dal premium 1kg")) {v4=112;}
        if( i4.equals("premia groundnut 500g")) {v4=69;}
        if( i4.equals("moong whole 1kg")) {v4=107;}
        if( i4.equals("chana dal 1kg")) {v4=82;}
        if( i4.equals("kabuli dal 500g")) {v4=49;}
        if( i4.equals("urad dal 500g")) {v4=54;}
        if( i4.equals("masoor dal 1kg")) {v4=78;}
        if( i4.equals("badam 500g")) {v4=405;}
        if( i4.equals("akrod magaj 100g")) {v4=162;}
        if( i4.equals("kaju 500g")) {v4=520;}
        if( i4.equals("anjeer")) {v4=114;}
        if( i4.equals("makhana 100g")) {v4=250;}
        if( i4.equals("wheat flour 1kg")) {v4=36;}
        if( i4.equals("besan 500g")) {v4=38;}
        if( i4.equals("dates 500g")) {v4=119;}
        
        String value4 = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w4 = Integer.parseInt(value4);
        
        String unit4 = JOptionPane.showInputDialog("enter the unit =    ");
        int u4 = Integer.parseInt(unit4);
        
        
        
        String i5 = JOptionPane.showInputDialog("enter the item =    ");
        if( i5.equals("examination pad") || i5.equals("file divider")|| i5.equals("filpfile 20pg")|| i5.equals("scissor medium") || i5.equals("file divider carboard")) {v5=16;}

        if( i5.equals("a4 hard cover 72 pages") || i5.equals("portfolio file")) {v5=6;}
        if( i5.equals("a4 hard cover 96 pages")) {v5=14;}
        if( i5.equals("a4 hard cover 192 pages") || i5.equals("a4 hard cover 192 pages qad book") ) {v5=22;}
        if( i5.equals("a4 hard cover 288 pages")) {v5=29;}
        if( i5.equals("book cover a4")) {v5=37;}
        if( i5.equals("a3 cardboard")) {v5=4;}
       
        if( i5.equals("a3 photostat paper")) {v5=1;}
        if( i5.equals("cartidge paper a3") || i5.equals("a4 cardboard")) {v5=2;}
        if( i5.equals("carry case")) {v5=170;}
        if( i5.equals("calculator casio plus")) {v5=320;}
        if( i5.equals("a4 document wallet") || i5.equals("file sleeve 10") || i5.equals("highlighter") || i5.equals("bic click pen")) {v5=8;}
        if( i5.equals("envelop a3") || i5.equals("eraser") || i5.equals("pencil") || i5.equals("clck pen") || i5.equals("rulers 30cm") || i5.equals("sharpener metal") ) {v5=5;}
        if( i5.equals("putty eraser") || i5.equals("flipfile 30pg") || i5.equals("paint brush 8/10") || i5.equals("scissor large") ) {v5=20;}
        if( i5.equals("file divider pvc")) {v5=18;}
        if( i5.equals("file liver arch 40mm")) {v5=24;}
        if( i5.equals("file liver arch 70mm")) {v5=26;}
        if( i5.equals("ringbinder file")) {v5=17;}
        if( i5.equals("flipfile 50pg") || i5.equals("punch")) {v5=35;}
        if( i5.equals("pack of book labels") || i5.equals("ruler 15") ) {v5=3;}
        if( i5.equals("masking tape 12mm")) {v5=9;}
        if( i5.equals("paint 6 color set")) {v5=105;}
        
        if( i5.equals("paint brush 4/6")) {v5=13;}
        if( i5.equals("paint brush 1/2")) {v5=10;}
        if( i5.equals("long paint brushes")) {v5=40;}
        if( i5.equals("palette 6 well") || i5.equals("clutch pencil") || i5.equals("tippex") ) {v5=15;}
        if( i5.equals("clutch pencil hb led 0.5") || i5.equals("protractor 10cm") ) {v5=7;}
        if( i5.equals("tippex pen") || i5.equals("protractor 15cm") ) {v5=12;}
        if( i5.equals("set square 25cm 30/60") || i5.equals("set square 25cm 45/90") ) {v5=25;}
        if( i5.equals("a4 visual diary 150pg")) {v5=90;}
        if( i5.equals("a2 source book")) {v5=165;}
        if( i5.equals("tur dal 1kg") || i5.equals("moong dal 1kg") ) {v5=99;}
        if( i5.equals("tur dal premium 1kg")) {v5=112;}
        if( i5.equals("premia groundnut 500g")) {v5=69;}
        if( i5.equals("moong whole 1kg")) {v5=107;}
        if( i5.equals("chana dal 1kg")) {v5=82;}
        if( i5.equals("kabuli dal 500g")) {v5=49;}
        if( i5.equals("urad dal 500g")) {v5=54;}
        if( i5.equals("masoor dal 1kg")) {v5=78;}
        if( i5.equals("badam 500g")) {v5=405;}
        if( i5.equals("akrod magaj 100g")) {v5=162;}
        if( i5.equals("kaju 500g")) {v5=520;}
        if( i5.equals("anjeer")) {v5=114;}
        if( i5.equals("makhana 100g")) {v5=250;}
        if( i5.equals("wheat flour 1kg")) {v5=36;}
        if( i5.equals("besan 500g")) {v5=38;}
        if( i5.equals("dates 500g")) {v5=119;}
        
        String value5 = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w5 = Integer.parseInt(value5);
        
        String unit5 = JOptionPane.showInputDialog("enter the unit =    ");
        int u5 = Integer.parseInt(unit5);
        
        
        
        String i6 = JOptionPane.showInputDialog("enter the item =    ");
        if( i6.equals("examination pad") || i6.equals("file divider")|| i6.equals("filpfile 20pg")|| i6.equals("scissor medium") || i6.equals("file divider carboard")) {v6=16;}

        if( i6.equals("a4 hard cover 72 pages") || i6.equals("portfolio file")) {v6=6;}
        if( i6.equals("a4 hard cover 96 pages")) {v6=14;}
        if( i6.equals("a4 hard cover 192 pages") || i6.equals("a4 hard cover 192 pages qad book") ) {v6=22;}
        if( i6.equals("a4 hard cover 288 pages")) {v6=29;}
        if( i6.equals("book cover a4")) {v6=37;}
        if( i6.equals("a3 cardboard")) {v6=4;}
       
        if( i6.equals("a3 photostat paper")) {v6=1;}
        if( i6.equals("cartidge paper a3") || i6.equals("a4 cardboard")) {v6=2;}
        if( i6.equals("carry case")) {v6=170;}
        if( i6.equals("calculator casio plus")) {v6=320;}
        if( i6.equals("a4 document wallet") || i6.equals("file sleeve 10") || i6.equals("highlighter") || i6.equals("bic click pen")) {v6=8;}
        if( i6.equals("envelop a3") || i6.equals("eraser") || i6.equals("pencil") || i6.equals("clck pen") || i6.equals("rulers 30cm") || i6.equals("sharpener metal") ) {v6=5;}
        if( i6.equals("putty eraser") || i6.equals("flipfile 30pg") || i6.equals("paint brush 8/10") || i6.equals("scissor large") ) {v6=20;}
        if( i6.equals("file divider pvc")) {v6=18;}
        if( i6.equals("file liver arch 40mm")) {v6=24;}
        if( i6.equals("file liver arch 70mm")) {v6=26;}
        if( i6.equals("ringbinder file")) {v6=17;}
        if( i6.equals("flipfile 50pg") || i6.equals("punch")) {v6=35;}
        if( i6.equals("pack of book labels") || i6.equals("ruler 15") ) {v6=3;}
        if( i6.equals("masking tape 12mm")) {v6=9;}
        if( i6.equals("paint 6 color set")) {v6=105;}
        
        if( i6.equals("paint brush 4/6")) {v6=13;}
        if( i6.equals("paint brush 1/2")) {v6=10;}
        if( i6.equals("long paint brushes")) {v6=40;}
        if( i6.equals("palette 6 well") || i6.equals("clutch pencil") || i6.equals("tippex") ) {v6=15;}
        if( i6.equals("clutch pencil hb led 0.5") || i6.equals("protractor 10cm") ) {v6=7;}
        if( i6.equals("tippex pen") || i6.equals("protractor 15cm") ) {v6=12;}
        if( i6.equals("set square 25cm 30/60") || i6.equals("set square 25cm 45/90") ) {v6=25;}
        if( i6.equals("a4 visual diary 150pg")) {v6=90;}
        if( i6.equals("a2 source book")) {v6=165;}
        if( i6.equals("tur dal 1kg") || i6.equals("moong dal 1kg") ) {v6=99;}
        if( i6.equals("tur dal premium 1kg")) {v6=112;}
        if( i6.equals("premia groundnut 500g")) {v6=69;}
        if( i6.equals("moong whole 1kg")) {v6=107;}
        if( i6.equals("chana dal 1kg")) {v6=82;}
        if( i6.equals("kabuli dal 500g")) {v6=49;}
        if( i6.equals("urad dal 500g")) {v6=54;}
        if( i6.equals("masoor dal 1kg")) {v6=78;}
        if( i6.equals("badam 500g")) {v6=405;}
        if( i6.equals("akrod magaj 100g")) {v6=162;}
        if( i6.equals("kaju 500g")) {v6=520;}
        if( i6.equals("anjeer")) {v6=114;}
        if( i6.equals("makhana 100g")) {v6=250;}
        if( i6.equals("wheat flour 1kg")) {v6=36;}
        if( i6.equals("besan 500g")) {v6=38;}
        if( i6.equals("dates 500g")) {v6=119;}
        
        String value6 = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w6 = Integer.parseInt(value6);
        
        String unit6 = JOptionPane.showInputDialog("enter the unit =    ");
        int u6 = Integer.parseInt(unit6);
        
        
        
        String i7 = JOptionPane.showInputDialog("enter the item =    ");
        if( i7.equals("examination pad") || i7.equals("file divider")|| i7.equals("filpfile 20pg")|| i7.equals("scissor medium") || i7.equals("file divider carboard")) {v7=16;}

        if( i7.equals("a4 hard cover 72 pages") || i7.equals("portfolio file")) {v7=6;}
        if( i7.equals("a4 hard cover 96 pages")) {v7=14;}
        if( i7.equals("a4 hard cover 192 pages") || i7.equals("a4 hard cover 192 pages qad book") ) {v7=22;}
        if( i7.equals("a4 hard cover 288 pages")) {v7=29;}
        if( i7.equals("book cover a4")) {v7=37;}
        if( i7.equals("a3 cardboard")) {v7=4;}
       
        if( i7.equals("a3 photostat paper")) {v7=1;}
        if( i7.equals("cartidge paper a3") || i7.equals("a4 cardboard")) {v7=2;}
        if( i7.equals("carry case")) {v7=170;}
        if( i7.equals("calculator casio plus")) {v7=320;}
        if( i7.equals("a4 document wallet") || i7.equals("file sleeve 10") || i7.equals("highlighter") || i7.equals("bic click pen")) {v7=8;}
        if( i7.equals("envelop a3") || i7.equals("eraser") || i7.equals("pencil") || i7.equals("clck pen") || i7.equals("rulers 30cm") || i7.equals("sharpener metal") ) {v7=5;}
        if( i7.equals("putty eraser") || i7.equals("flipfile 30pg") || i7.equals("paint brush 8/10") || i7.equals("scissor large") ) {v7=20;}
        if( i7.equals("file divider pvc")) {v7=18;}
        if( i7.equals("file liver arch 40mm")) {v7=24;}
        if( i7.equals("file liver arch 70mm")) {v7=26;}
        if( i7.equals("ringbinder file")) {v7=17;}
        if( i7.equals("flipfile 50pg") || i7.equals("punch")) {v7=35;}
        if( i7.equals("pack of book labels") || i7.equals("ruler 15") ) {v7=3;}
        if( i7.equals("masking tape 12mm")) {v7=9;}
        if( i7.equals("paint 6 color set")) {v7=105;}
        
        if( i7.equals("paint brush 4/6")) {v7=13;}
        if( i7.equals("paint brush 1/2")) {v7=10;}
        if( i7.equals("long paint brushes")) {v7=40;}
        if( i7.equals("palette 6 well") || i7.equals("clutch pencil") || i7.equals("tippex") ) {v7=15;}
        if( i7.equals("clutch pencil hb led 0.5") || i7.equals("protractor 10cm") ) {v7=7;}
        if( i7.equals("tippex pen") || i7.equals("protractor 15cm") ) {v7=12;}
        if( i7.equals("set square 25cm 30/60") || i7.equals("set square 25cm 45/90") ) {v7=25;}
        if( i7.equals("a4 visual diary 150pg")) {v7=90;}
        if( i7.equals("a2 source book")) {v7=165;}
        if( i7.equals("tur dal 1kg") || i7.equals("moong dal 1kg") ) {v7=99;}
        if( i7.equals("tur dal premium 1kg")) {v7=112;}
        if( i7.equals("premia groundnut 500g")) {v7=69;}
        if( i7.equals("moong whole 1kg")) {v7=107;}
        if( i7.equals("chana dal 1kg")) {v7=82;}
        if( i7.equals("kabuli dal 500g")) {v7=49;}
        if( i7.equals("urad dal 500g")) {v7=54;}
        if( i7.equals("masoor dal 1kg")) {v7=78;}
        if( i7.equals("badam 500g")) {v7=405;}
        if( i7.equals("akrod magaj 100g")) {v7=162;}
        if( i7.equals("kaju 500g")) {v7=520;}
        if( i7.equals("anjeer")) {v7=114;}
        if( i7.equals("makhana 100g")) {v7=250;}
        if( i7.equals("wheat flour 1kg")) {v7=36;}
        if( i7.equals("besan 500g")) {v7=38;}
        if( i7.equals("dates 500g")) {v7=119;}
        
        String value7 = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w7 = Integer.parseInt(value7);
        
        String unit7 = JOptionPane.showInputDialog("enter the unit =    ");
        int u7 = Integer.parseInt(unit7);
        
        
        
        String i8 = JOptionPane.showInputDialog("enter the item =    ");
        if( i8.equals("examination pad") || i8.equals("file divider")|| i8.equals("filpfile 20pg")|| i8.equals("scissor medium") || i8.equals("file divider carboard")) {v8=16;}

        if( i8.equals("a4 hard cover 72 pages") || i8.equals("portfolio file")) {v8=6;}
        if( i8.equals("a4 hard cover 96 pages")) {v8=14;}
        if( i8.equals("a4 hard cover 192 pages") || i8.equals("a4 hard cover 192 pages qad book") ) {v8=22;}
        if( i8.equals("a4 hard cover 288 pages")) {v8=29;}
        if( i8.equals("book cover a4")) {v8=37;}
        if( i8.equals("a3 cardboard")) {v8=4;}
       
        if( i8.equals("a3 photostat paper")) {v8=1;}
        if( i8.equals("cartidge paper a3") || i8.equals("a4 cardboard")) {v8=2;}
        if( i8.equals("carry case")) {v8=170;}
        if( i8.equals("calculator casio plus")) {v8=320;}
        if( i8.equals("a4 document wallet") || i8.equals("file sleeve 10") || i8.equals("highlighter") || i8.equals("bic click pen")) {v8=8;}
        if( i8.equals("envelop a3") || i8.equals("eraser") || i8.equals("pencil") || i8.equals("clck pen") || i8.equals("rulers 30cm") || i8.equals("sharpener metal") ) {v8=5;}
        if( i8.equals("putty eraser") || i8.equals("flipfile 30pg") || i8.equals("paint brush 8/10") || i8.equals("scissor large") ) {v8=20;}
        if( i8.equals("file divider pvc")) {v8=18;}
        if( i8.equals("file liver arch 40mm")) {v8=24;}
        if( i8.equals("file liver arch 70mm")) {v8=26;}
        if( i8.equals("ringbinder file")) {v8=17;}
        if( i8.equals("flipfile 50pg") || i8.equals("punch")) {v8=35;}
        if( i8.equals("pack of book labels") || i8.equals("ruler 15") ) {v8=3;}
        if( i8.equals("masking tape 12mm")) {v8=9;}
        if( i8.equals("paint 6 color set")) {v8=105;}
        
        if( i8.equals("paint brush 4/6")) {v8=13;}
        if( i8.equals("paint brush 1/2")) {v8=10;}
        if( i8.equals("long paint brushes")) {v8=40;}
        if( i8.equals("palette 6 well") || i8.equals("clutch pencil") || i8.equals("tippex") ) {v8=15;}
        if( i8.equals("clutch pencil hb led 0.5") || i8.equals("protractor 10cm") ) {v8=7;}
        if( i8.equals("tippex pen") || i8.equals("protractor 15cm") ) {v8=12;}
        if( i8.equals("set square 25cm 30/60") || i8.equals("set square 25cm 45/90") ) {v8=25;}
        if( i8.equals("a4 visual diary 150pg")) {v8=90;}
        if( i8.equals("a2 source book")) {v8=165;}
        if( i8.equals("tur dal 1kg") || i8.equals("moong dal 1kg") ) {v8=99;}
        if( i8.equals("tur dal premium 1kg")) {v8=112;}
        if( i8.equals("premia groundnut 500g")) {v8=69;}
        if( i8.equals("moong whole 1kg")) {v8=107;}
        if( i8.equals("chana dal 1kg")) {v8=82;}
        if( i8.equals("kabuli dal 500g")) {v8=49;}
        if( i8.equals("urad dal 500g")) {v8=54;}
        if( i8.equals("masoor dal 1kg")) {v8=78;}
        if( i8.equals("badam 500g")) {v8=405;}
        if( i8.equals("akrod magaj 100g")) {v8=162;}
        if( i8.equals("kaju 500g")) {v8=520;}
        if( i8.equals("anjeer")) {v8=114;}
        if( i8.equals("makhana 100g")) {v8=250;}
        if( i8.equals("wheat flour 1kg")) {v8=36;}
        if( i8.equals("besan 500g")) {v8=38;}
        if( i8.equals("dates 500g")) {v8=119;}
        
        String value8 = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w8 = Integer.parseInt(value8);
        
        String unit8 = JOptionPane.showInputDialog("enter the unit =    ");
        int u8 = Integer.parseInt(unit8);
        
        
        
        String i9 = JOptionPane.showInputDialog("enter the item =    ");
        if( i9.equals("examination pad") || i9.equals("file divider")|| i9.equals("filpfile 20pg")|| i9.equals("scissor medium") || i9.equals("file divider carboard")) {v9=16;}

        if( i9.equals("a4 hard cover 72 pages") || i9.equals("portfolio file")) {v9=6;}
        if( i9.equals("a4 hard cover 96 pages")) {v9=14;}
        if( i9.equals("a4 hard cover 192 pages") || i9.equals("a4 hard cover 192 pages qad book") ) {v9=22;}
        if( i9.equals("a4 hard cover 288 pages")) {v9=29;}
        if( i9.equals("book cover a4")) {v9=37;}
        if( i9.equals("a3 cardboard")) {v9=4;}
       
        if( i9.equals("a3 photostat paper")) {v9=1;}
        if( i9.equals("cartidge paper a3") || i9.equals("a4 cardboard")) {v9=2;}
        if( i9.equals("carry case")) {v9=170;}
        if( i9.equals("calculator casio plus")) {v9=320;}
        if( i9.equals("a4 document wallet") || i9.equals("file sleeve 10") || i9.equals("highlighter") || i9.equals("bic click pen")) {v9=8;}
        if( i9.equals("envelop a3") || i9.equals("eraser") || i9.equals("pencil") || i9.equals("clck pen") || i9.equals("rulers 30cm") || i9.equals("sharpener metal") ) {v9=5;}
        if( i9.equals("putty eraser") || i9.equals("flipfile 30pg") || i9.equals("paint brush 8/10") || i9.equals("scissor large") ) {v9=20;}
        if( i9.equals("file divider pvc")) {v9=18;}
        if( i9.equals("file liver arch 40mm")) {v9=24;}
        if( i9.equals("file liver arch 70mm")) {v9=26;}
        if( i9.equals("ringbinder file")) {v9=17;}
        if( i9.equals("flipfile 50pg") || i9.equals("punch")) {v9=35;}
        if( i9.equals("pack of book labels") || i9.equals("ruler 15") ) {v9=3;}
        if( i9.equals("masking tape 12mm")) {v9=9;}
        if( i9.equals("paint 6 color set")) {v9=105;}
        
        if( i9.equals("paint brush 4/6")) {v9=13;}
        if( i9.equals("paint brush 1/2")) {v9=10;}
        if( i9.equals("long paint brushes")) {v9=40;}
        if( i9.equals("palette 6 well") || i9.equals("clutch pencil") || i9.equals("tippex") ) {v9=15;}
        if( i9.equals("clutch pencil hb led 0.5") || i9.equals("protractor 10cm") ) {v9=7;}
        if( i9.equals("tippex pen") || i9.equals("protractor 15cm") ) {v9=12;}
        if( i9.equals("set square 25cm 30/60") || i9.equals("set square 25cm 45/90") ) {v9=25;}
        if( i9.equals("a4 visual diary 150pg")) {v9=90;}
        if( i9.equals("a2 source book")) {v9=165;}
        if( i9.equals("tur dal 1kg") || i9.equals("moong dal 1kg") ) {v9=99;}
        if( i9.equals("tur dal premium 1kg")) {v9=112;}
        if( i9.equals("premia groundnut 500g")) {v9=69;}
        if( i9.equals("moong whole 1kg")) {v9=107;}
        if( i9.equals("chana dal 1kg")) {v9=82;}
        if( i9.equals("kabuli dal 500g")) {v9=49;}
        if( i9.equals("urad dal 500g")) {v9=54;}
        if( i9.equals("masoor dal 1kg")) {v9=78;}
        if( i9.equals("badam 500g")) {v9=405;}
        if( i9.equals("akrod magaj 100g")) {v9=162;}
        if( i9.equals("kaju 500g")) {v9=520;}
        if( i9.equals("anjeer")) {v9=114;}
        if( i9.equals("makhana 100g")) {v9=250;}
        if( i9.equals("wheat flour 1kg")) {v9=36;}
        if( i9.equals("besan 500g")) {v9=38;}
        if( i9.equals("dates 500g")) {v9=119;}
        
        String value9 = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w9 = Integer.parseInt(value9);
        
        String unit9 = JOptionPane.showInputDialog("enter the unit =    ");
        int u9 = Integer.parseInt(unit9);
        
        
        
        String i10 = JOptionPane.showInputDialog("enter the item =    ");
        if( i10.equals("examination pad") || i10.equals("file divider")|| i10.equals("filpfile 20pg")|| i10.equals("scissor medium") || i10.equals("file divider carboard")) {v10=16;}

        if( i10.equals("a4 hard cover 72 pages") || i10.equals("portfolio file")) {v10=6;}
        if( i10.equals("a4 hard cover 96 pages")) {v10=14;}
        if( i10.equals("a4 hard cover 192 pages") || i10.equals("a4 hard cover 192 pages qad book") ) {v10=22;}
        if( i10.equals("a4 hard cover 288 pages")) {v10=29;}
        if( i10.equals("book cover a4")) {v10=37;}
        if( i10.equals("a3 cardboard")) {v10=4;}
       
        if( i10.equals("a3 photostat paper")) {v10=1;}
        if( i10.equals("cartidge paper a3") || i10.equals("a4 cardboard")) {v10=2;}
        if( i10.equals("carry case")) {v10=170;}
        if( i10.equals("calculator casio plus")) {v10=320;}
        if( i10.equals("a4 document wallet") || i10.equals("file sleeve 10") || i10.equals("highlighter") || i10.equals("bic click pen")) {v10=8;}
        if( i10.equals("envelop a3") || i10.equals("eraser") || i10.equals("pencil") || i10.equals("clck pen") || i10.equals("rulers 30cm") || i10.equals("sharpener metal") ) {v10=5;}
        if( i10.equals("putty eraser") || i10.equals("flipfile 30pg") || i10.equals("paint brush 8/10") || i10.equals("scissor large") ) {v10=20;}
        if( i10.equals("file divider pvc")) {v10=18;}
        if( i10.equals("file liver arch 40mm")) {v10=24;}
        if( i10.equals("file liver arch 70mm")) {v10=26;}
        if( i10.equals("ringbinder file")) {v10=17;}
        if( i10.equals("flipfile 50pg") || i10.equals("punch")) {v10=35;}
        if( i10.equals("pack of book labels") || i10.equals("ruler 15") ) {v10=3;}
        if( i10.equals("masking tape 12mm")) {v10=9;}
        if( i10.equals("paint 6 color set")) {v10=105;}
        
        if( i10.equals("paint brush 4/6")) {v10=13;}
        if( i10.equals("paint brush 1/2")) {v10=10;}
        if( i10.equals("long paint brushes")) {v10=40;}
        if( i10.equals("palette 6 well") || i10.equals("clutch pencil") || i10.equals("tippex") ) {v10=15;}
        if( i10.equals("clutch pencil hb led 0.5") || i10.equals("protractor 10cm") ) {v10=7;}
        if( i10.equals("tippex pen") || i10.equals("protractor 15cm") ) {v10=12;}
        if( i10.equals("set square 25cm 30/60") || i10.equals("set square 25cm 45/90") ) {v10=25;}
        if( i10.equals("a4 visual diary 150pg")) {v10=90;}
        if( i10.equals("a2 source book")) {v10=165;}
        if( i10.equals("tur dal 1kg") || i10.equals("moong dal 1kg") ) {v10=99;}
        if( i10.equals("tur dal premium 1kg")) {v10=112;}
        if( i10.equals("premia groundnut 500g")) {v10=69;}
        if( i10.equals("moong whole 1kg")) {v10=107;}
        if( i10.equals("chana dal 1kg")) {v10=82;}
        if( i10.equals("kabuli dal 500g")) {v10=49;}
        if( i10.equals("urad dal 500g")) {v10=54;}
        if( i10.equals("masoor dal 1kg")) {v10=78;}
        if( i10.equals("badam 500g")) {v10=405;}
        if( i10.equals("akrod magaj 100g")) {v10=162;}
        if( i10.equals("kaju 500g")) {v10=520;}
        if( i10.equals("anjeer")) {v10=114;}
        if( i10.equals("makhana 100g")) {v10=250;}
        if( i10.equals("wheat flour 1kg")) {v10=36;}
        if( i10.equals("besan 500g")) {v10=38;}
        if( i10.equals("dates 500g")) {v10=119;}
        
        String value10 = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w10 = Integer.parseInt(value10);
        
        String unit10 = JOptionPane.showInputDialog("enter the unit =    ");
        int u10 = Integer.parseInt(unit10);
        
        
        
        String i11 = JOptionPane.showInputDialog("enter the item =    ");
        if( i11.equals("examination pad") || i11.equals("file divider")|| i11.equals("filpfile 20pg")|| i11.equals("scissor medium") || i11.equals("file divider carboard")) {v11=16;}

        if( i11.equals("a4 hard cover 72 pages") || i11.equals("portfolio file")) {v11=6;}
        if( i11.equals("a4 hard cover 96 pages")) {v11=14;}
        if( i11.equals("a4 hard cover 192 pages") || i11.equals("a4 hard cover 192 pages qad book") ) {v11=22;}
        if( i11.equals("a4 hard cover 288 pages")) {v11=29;}
        if( i11.equals("book cover a4")) {v11=37;}
        if( i11.equals("a3 cardboard")) {v11=4;}
       
        if( i11.equals("a3 photostat paper")) {v11=1;}
        if( i11.equals("cartidge paper a3") || i11.equals("a4 cardboard")) {v11=2;}
        if( i11.equals("carry case")) {v11=170;}
        if( i11.equals("calculator casio plus")) {v11=320;}
        if( i11.equals("a4 document wallet") || i11.equals("file sleeve 10") || i11.equals("highlighter") || i11.equals("bic click pen")) {v11=8;}
        if( i11.equals("envelop a3") || i11.equals("eraser") || i11.equals("pencil") || i11.equals("clck pen") || i11.equals("rulers 30cm") || i11.equals("sharpener metal") ) {v11=5;}
        if( i11.equals("putty eraser") || i11.equals("flipfile 30pg") || i11.equals("paint brush 8/10") || i11.equals("scissor large") ) {v11=20;}
        if( i11.equals("file divider pvc")) {v11=18;}
        if( i11.equals("file liver arch 40mm")) {v11=24;}
        if( i11.equals("file liver arch 70mm")) {v11=26;}
        if( i11.equals("ringbinder file")) {v11=17;}
        if( i11.equals("flipfile 50pg") || i11.equals("punch")) {v11=35;}
        if( i11.equals("pack of book labels") || i11.equals("ruler 15") ) {v11=3;}
        if( i11.equals("masking tape 12mm")) {v11=9;}
        if( i11.equals("paint 6 color set")) {v11=105;}
        
        if( i11.equals("paint brush 4/6")) {v11=13;}
        if( i11.equals("paint brush 1/2")) {v11=10;}
        if( i11.equals("long paint brushes")) {v11=40;}
        if( i11.equals("palette 6 well") || i11.equals("clutch pencil") || i11.equals("tippex") ) {v11=15;}
        if( i11.equals("clutch pencil hb led 0.5") || i11.equals("protractor 10cm") ) {v11=7;}
        if( i11.equals("tippex pen") || i11.equals("protractor 15cm") ) {v11=12;}
        if( i11.equals("set square 25cm 30/60") || i11.equals("set square 25cm 45/90") ) {v11=25;}
        if( i11.equals("a4 visual diary 150pg")) {v11=90;}
        if( i11.equals("a2 source book")) {v11=165;}
        if( i11.equals("tur dal 1kg") || i11.equals("moong dal 1kg") ) {v11=99;}
        if( i11.equals("tur dal premium 1kg")) {v11=112;}
        if( i11.equals("premia groundnut 500g")) {v11=69;}
        if( i11.equals("moong whole 1kg")) {v11=107;}
        if( i11.equals("chana dal 1kg")) {v11=82;}
        if( i11.equals("kabuli dal 500g")) {v11=49;}
        if( i11.equals("urad dal 500g")) {v11=54;}
        if( i11.equals("masoor dal 1kg")) {v11=78;}
        if( i11.equals("badam 500g")) {v11=405;}
        if( i11.equals("akrod magaj 100g")) {v11=162;}
        if( i11.equals("kaju 500g")) {v11=520;}
        if( i11.equals("anjeer")) {v11=114;}
        if( i11.equals("makhana 100g")) {v11=250;}
        if( i11.equals("wheat flour 1kg")) {v11=36;}
        if( i11.equals("besan 500g")) {v11=38;}
        if( i11.equals("dates 500g")) {v11=119;}
        
        String value11 = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w11 = Integer.parseInt(value11);
        
        String unit11 = JOptionPane.showInputDialog("enter the unit =    ");
        int u11 = Integer.parseInt(unit11);
        
        
        
        String i12 = JOptionPane.showInputDialog("enter the item =    ");
       if( i12.equals("examination pad") || i12.equals("file divider")|| i12.equals("filpfile 20pg")|| i12.equals("scissor medium") || i12.equals("file divider carboard")) {v12=16;}

        if( i12.equals("a4 hard cover 72 pages") || i12.equals("portfolio file")) {v12=6;}
        if( i12.equals("a4 hard cover 96 pages")) {v12=14;}
        if( i12.equals("a4 hard cover 192 pages") || i12.equals("a4 hard cover 192 pages qad book") ) {v12=22;}
        if( i12.equals("a4 hard cover 288 pages")) {v12=29;}
        if( i12.equals("book cover a4")) {v12=37;}
        if( i12.equals("a3 cardboard")) {v12=4;}
       
        if( i12.equals("a3 photostat paper")) {v12=1;}
        if( i12.equals("cartidge paper a3") || i12.equals("a4 cardboard")) {v12=2;}
        if( i12.equals("carry case")) {v12=170;}
        if( i12.equals("calculator casio plus")) {v12=320;}
        if( i12.equals("a4 document wallet") || i12.equals("file sleeve 10") || i12.equals("highlighter") || i12.equals("bic click pen")) {v12=8;}
        if( i12.equals("envelop a3") || i12.equals("eraser") || i12.equals("pencil") || i12.equals("clck pen") || i12.equals("rulers 30cm") || i12.equals("sharpener metal") ) {v12=5;}
        if( i12.equals("putty eraser") || i12.equals("flipfile 30pg") || i12.equals("paint brush 8/10") || i12.equals("scissor large") ) {v12=20;}
        if( i12.equals("file divider pvc")) {v12=18;}
        if( i12.equals("file liver arch 40mm")) {v12=24;}
        if( i12.equals("file liver arch 70mm")) {v12=26;}
        if( i12.equals("ringbinder file")) {v12=17;}
        if( i12.equals("flipfile 50pg") || i12.equals("punch")) {v12=35;}
        if( i12.equals("pack of book labels") || i12.equals("ruler 15") ) {v12=3;}
        if( i12.equals("masking tape 12mm")) {v12=9;}
        if( i12.equals("paint 6 color set")) {v12=105;}
        
        if( i12.equals("paint brush 4/6")) {v12=13;}
        if( i12.equals("paint brush 1/2")) {v12=10;}
        if( i12.equals("long paint brushes")) {v12=40;}
        if( i12.equals("palette 6 well") || i12.equals("clutch pencil") || i12.equals("tippex") ) {v12=15;}
        if( i12.equals("clutch pencil hb led 0.5") || i12.equals("protractor 10cm") ) {v12=7;}
        if( i12.equals("tippex pen") || i12.equals("protractor 15cm") ) {v12=12;}
        if( i12.equals("set square 25cm 30/60") || i12.equals("set square 25cm 45/90") ) {v12=25;}
        if( i12.equals("a4 visual diary 150pg")) {v12=90;}
        if( i12.equals("a2 source book")) {v12=165;}
        if( i12.equals("tur dal 1kg") || i12.equals("moong dal 1kg") ) {v12=99;}
        if( i12.equals("tur dal premium 1kg")) {v12=112;}
        if( i12.equals("premia groundnut 500g")) {v12=69;}
        if( i12.equals("moong whole 1kg")) {v12=107;}
        if( i12.equals("chana dal 1kg")) {v12=82;}
        if( i12.equals("kabuli dal 500g")) {v12=49;}
        if( i12.equals("urad dal 500g")) {v12=54;}
        if( i12.equals("masoor dal 1kg")) {v12=78;}
        if( i12.equals("badam 500g")) {v12=405;}
        if( i12.equals("akrod magaj 100g")) {v12=162;}
        if( i12.equals("kaju 500g")) {v12=520;}
        if( i12.equals("anjeer")) {v12=114;}
        if( i12.equals("makhana 100g")) {v12=250;}
        if( i12.equals("wheat flour 1kg")) {v12=36;}
        if( i12.equals("besan 500g")) {v12=38;}
        if( i12.equals("dates 500g")) {v12=119;}
        
        String value12 = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w12 = Integer.parseInt(value12);
        
        String unit12 = JOptionPane.showInputDialog("enter the unit =    ");
        int u12 = Integer.parseInt(unit12);
        
        
        
        String i13 = JOptionPane.showInputDialog("enter the item =    ");
        if( i13.equals("examination pad") || i13.equals("file divider")|| i13.equals("filpfile 20pg")|| i13.equals("scissor medium") || i13.equals("file divider carboard")) {v13=16;}

        if( i13.equals("a4 hard cover 72 pages") || i13.equals("portfolio file")) {v13=6;}
        if( i13.equals("a4 hard cover 96 pages")) {v13=14;}
        if( i13.equals("a4 hard cover 192 pages") || i13.equals("a4 hard cover 192 pages qad book") ) {v13=22;}
        if( i13.equals("a4 hard cover 288 pages")) {v13=29;}
        if( i13.equals("book cover a4")) {v13=37;}
        if( i13.equals("a3 cardboard")) {v13=4;}
       
        if( i13.equals("a3 photostat paper")) {v13=1;}
        if( i13.equals("cartidge paper a3") || i13.equals("a4 cardboard")) {v13=2;}
        if( i13.equals("carry case")) {v13=170;}
        if( i13.equals("calculator casio plus")) {v13=320;}
        if( i13.equals("a4 document wallet") || i13.equals("file sleeve 10") || i13.equals("highlighter") || i13.equals("bic click pen")) {v13=8;}
        if( i13.equals("envelop a3") || i13.equals("eraser") || i13.equals("pencil") || i13.equals("clck pen") || i13.equals("rulers 30cm") || i13.equals("sharpener metal") ) {v13=5;}
        if( i13.equals("putty eraser") || i13.equals("flipfile 30pg") || i13.equals("paint brush 8/10") || i13.equals("scissor large") ) {v13=20;}
        if( i13.equals("file divider pvc")) {v13=18;}
        if( i13.equals("file liver arch 40mm")) {v13=24;}
        if( i13.equals("file liver arch 70mm")) {v13=26;}
        if( i13.equals("ringbinder file")) {v13=17;}
        if( i13.equals("flipfile 50pg") || i13.equals("punch")) {v13=35;}
        if( i13.equals("pack of book labels") || i13.equals("ruler 15") ) {v13=3;}
        if( i13.equals("masking tape 12mm")) {v13=9;}
        if( i13.equals("paint 6 color set")) {v13=105;}
        
        if( i13.equals("paint brush 4/6")) {v13=13;}
        if( i13.equals("paint brush 1/2")) {v13=10;}
        if( i13.equals("long paint brushes")) {v13=40;}
        if( i13.equals("palette 6 well") || i13.equals("clutch pencil") || i13.equals("tippex") ) {v13=15;}
        if( i13.equals("clutch pencil hb led 0.5") || i13.equals("protractor 10cm") ) {v13=7;}
        if( i13.equals("tippex pen") || i13.equals("protractor 15cm") ) {v13=12;}
        if( i13.equals("set square 25cm 30/60") || i13.equals("set square 25cm 45/90") ) {v13=25;}
        if( i13.equals("a4 visual diary 150pg")) {v13=90;}
        if( i13.equals("a2 source book")) {v13=165;}
        if( i13.equals("tur dal 1kg") || i13.equals("moong dal 1kg") ) {v13=99;}
        if( i13.equals("tur dal premium 1kg")) {v13=112;}
        if( i13.equals("premia groundnut 500g")) {v13=69;}
        if( i13.equals("moong whole 1kg")) {v13=107;}
        if( i13.equals("chana dal 1kg")) {v13=82;}
        if( i13.equals("kabuli dal 500g")) {v13=49;}
        if( i13.equals("urad dal 500g")) {v13=54;}
        if( i13.equals("masoor dal 1kg")) {v13=78;}
        if( i13.equals("badam 500g")) {v13=405;}
        if( i13.equals("akrod magaj 100g")) {v13=162;}
        if( i13.equals("kaju 500g")) {v13=520;}
        if( i13.equals("anjeer")) {v13=114;}
        if( i13.equals("makhana 100g")) {v13=250;}
        if( i13.equals("wheat flour 1kg")) {v13=36;}
        if( i13.equals("besan 500g")) {v13=38;}
        if( i13.equals("dates 500g")) {v13=119;}
        
        String value13 = JOptionPane.showInputDialog("enter the item importance out of 10 =    ");
        int w13 = Integer.parseInt(value13);
        
        String unit13 = JOptionPane.showInputDialog("enter the unit =    ");
        int u13 = Integer.parseInt(unit13);
        
        
        bok.add(i, v, w, u);
        bok.add(i1, v1, w1, u1);
        bok.add(i2, v2, w2, u2);
        bok.add(i3, v3, w3, u3);
        bok.add(i4, v4, w4, u4);
        bok.add(i5, v5, w5, u5);
        bok.add(i6, v6, w6, u6);
        bok.add(i7, v7, w7, u7);
        bok.add(i8, v8, w8, u8);
        bok.add(i9, v9, w9, u9);
        bok.add(i10, v10, w10, u10);
        bok.add(i11, v11, w11, u11);
        bok.add(i12, v12, w12, u12);
        bok.add(i13, v13, w13, u13);
     
 
        // calculate the solution:
        List<Item> itemList = bok.calcSolution();
 
        // write out the solution in the standard output
        if (bok.isCalculated()) {
            NumberFormat nf  = NumberFormat.getInstance();
 
            System.out.println(
                "Maximal budget           = " +
                nf.format(bok.getMaxWeight() / 100.0)
            );
            String a = nf.format(bok.getMaxWeight() / 100.0);
            
            JOptionPane.showMessageDialog(null, "Maximal budget =    "+a);
                
            System.out.println(
                "Total solution = " +
                nf.format(bok.getSolutionWeight() / 100.0)
            );
            
            JOptionPane.showMessageDialog(null, "Total solution = " +
                nf.format(bok.getSolutionWeight() / 100.0));
            
            System.out.println(
                "Total value              = " +
                bok.getProfit()
            );
            
            JOptionPane.showMessageDialog(null, "Total value              = " +
                bok.getProfit());
            
            System.out.println(); 
            
            System.out.println(
                "You can carry te following materials " +
                "in the knapsack:"
            );
            
            JOptionPane.showMessageDialog(null, "You can carry the following materials " +
                "in the knapsack:");
            
            for (Item item : itemList) {
                if (item.getInKnapsack() > 0) {
                    System.out.format(
                        "%1$-10s %2$-23s %3$-3s %4$-5s %5$-15s \n",
                        item.getInKnapsack() + " unit(s) ",
                        item.getName(),
                        item.getInKnapsack() * item.getWeight(), "dag  ",
                        "(value = " + item.getInKnapsack() * item.getValue() + ")"
                    );
                    int b = item.getInKnapsack() * item.getWeight();
                    JOptionPane.showMessageDialog(null, item.getInKnapsack() + " unit(s) "+""+ item.getName());
                    
                }
            }
        } else {
            System.out.println(
                "The problem is not solved. " +
                "Maybe you gave wrong data."
            );
        }
 
    }
 
    public static void main(String[] args) {
        new BoundedKnapsackForTourists_3();
    }
} // class

 
class BoundedKnapsack_3 extends ZeroOneKnapsack_3{
    public BoundedKnapsack_3() {}
 
    public BoundedKnapsack_3(int _maxWeight) {
        setMaxWeight(_maxWeight);
    }
 
    public BoundedKnapsack_3(List<Item> _itemList) {
        setItemList(_itemList);
    }
 
    public BoundedKnapsack_3(List<Item> _itemList, int _maxWeight) {
        setItemList(_itemList);
        setMaxWeight(_maxWeight);
    }
 
    @Override
    public List<Item> calcSolution() {
        int n = itemList.size();
 
        // add items to the list, if bounding > 1
        for (int i = 0; i < n; i++) {
            Item item = itemList.get(i);
            if (item.getBounding() > 1) {
                for (int j = 1; j < item.getBounding(); j++) {
                    add(item.getName(), item.getWeight(), item.getValue());
                }
            }
        }
 
        super.calcSolution();
 
        // delete the added items, and increase the original items
        while (itemList.size() > n) {
            Item lastItem = itemList.get(itemList.size() - 1);
            if (lastItem.getInKnapsack() == 1) {
                for (int i = 0; i < n; i++) {
                    Item iH = itemList.get(i);
                    if (lastItem.getName().equals(iH.getName())) {
                        iH.setInKnapsack(1 + iH.getInKnapsack());
                        break;
                    }
                }
            }
            itemList.remove(itemList.size() - 1);
        }
 
        return itemList;
    }
 
    // add an item to the item list
    public void add(String name, int weight, int value, int bounding) {
        if (name.equals(""))
            name = "" + (itemList.size() + 1);
        itemList.add(new Item(name, weight, value, bounding));
        setInitialStateForCalculation();
    }
} // class
 
class ZeroOneKnapsack_3 {
    protected List<Item> itemList  = new ArrayList<Item>();
    protected int maxWeight        = 0;
    protected int solutionWeight   = 0;
    protected int profit           = 0;
    protected boolean calculated   = false;
 
    public ZeroOneKnapsack_3() {}
 
    public ZeroOneKnapsack_3(int _maxWeight) {
        setMaxWeight(_maxWeight);
    }
 
    public ZeroOneKnapsack_3(List<Item> _itemList) {
        setItemList(_itemList);
    }
 
    public ZeroOneKnapsack_3(List<Item> _itemList, int _maxWeight) {
        setItemList(_itemList);
        setMaxWeight(_maxWeight);
    }
 
    // calculte the solution of 0-1 knapsack problem with dynamic method:
    public List<Item> calcSolution() {
        int n = itemList.size();
 
        setInitialStateForCalculation();
        if (n > 0  &&  maxWeight > 0) {
            List< List<Integer> > c = new ArrayList< List<Integer> >();
            List<Integer> curr = new ArrayList<Integer>();
 
            c.add(curr);
            for (int j = 0; j <= maxWeight; j++)
                curr.add(0);
            for (int i = 1; i <= n; i++) {
                List<Integer> prev = curr;
                c.add(curr = new ArrayList<Integer>());
                for (int j = 0; j <= maxWeight; j++) {
                    if (j > 0) {
                        int wH = itemList.get(i-1).getWeight();
                        curr.add(
                            (wH > j)
                            ?
                            prev.get(j)
                            :
                            Math.max(
                                prev.get(j),
                                itemList.get(i-1).getValue() + prev.get(j-wH)
                            )
                        );
                    } else {
                        curr.add(0);
                    }
                } // for (j...)
            } // for (i...)
            profit = curr.get(maxWeight);
 
            for (int i = n, j = maxWeight; i > 0  &&  j >= 0; i--) {
                int tempI   = c.get(i).get(j);
                int tempI_1 = c.get(i-1).get(j);
                if (
                    (i == 0  &&  tempI > 0)
                    ||
                    (i > 0  &&  tempI != tempI_1)
                )
                {
                    Item iH = itemList.get(i-1);
                    int  wH = iH.getWeight();
                    iH.setInKnapsack(1);
                    j -= wH;
                    solutionWeight += wH;
                }
            } // for()
            calculated = true;
        } // if()
        return itemList;
    }
 
    // add an item to the item list
    public void add(String name, int weight, int value) {
        if (name.equals(""))
            name = "" + (itemList.size() + 1);
        itemList.add(new Item(name, weight, value));
        setInitialStateForCalculation();
    }
 
    // add an item to the item list
    public void add(int weight, int value) {
        add("", weight, value); // the name will be "itemList.size() + 1"!
    }
 
    // remove an item from the item list
    public void remove(String name) {
        for (Iterator<Item> it = itemList.iterator(); it.hasNext(); ) {
            if (name.equals(it.next().getName())) {
                it.remove();
            }
        }
        setInitialStateForCalculation();
    }
 
    // remove all items from the item list
    public void removeAllItems() {
        itemList.clear();
        setInitialStateForCalculation();
    }
 
    public int getProfit() {
        if (!calculated)
            calcSolution();
        return profit;
    }
 
    public int getSolutionWeight() {return solutionWeight;}
    public boolean isCalculated() {return calculated;}
    public int getMaxWeight() {return maxWeight;}
 
    public void setMaxWeight(int _maxWeight) {
        maxWeight = Math.max(_maxWeight, 0);
    }
 
    public void setItemList(List<Item> _itemList) {
        if (_itemList != null) {
            itemList = _itemList;
            for (Item item : _itemList) {
                item.checkMembers();
            }
        }
    }
 
    // set the member with name "inKnapsack" by all items:
    private void setInKnapsackByAll(int inKnapsack) {
        for (Item item : itemList)
            if (inKnapsack > 0)
                item.setInKnapsack(1);
            else
                item.setInKnapsack(0);
    }
 
    // set the data members of class in the state of starting the calculation:
    protected void setInitialStateForCalculation() {
        setInKnapsackByAll(0);
        calculated     = false;
        profit         = 0;
        solutionWeight = 0;
    }
} // class


 
class Item_3 {
    protected String name    = "";
    protected int weight     = 0;
    protected int value      = 0;
    protected int bounding   = 1; // the maximal limit of item's pieces
    protected int inKnapsack = 0; // the pieces of item in solution
 
    public Item_3() {}
 
    public Item_3(Item item) {
        setName(item.name);
        setWeight(item.weight);
        setValue(item.value);
        setBounding(item.bounding);
    }
 
    public Item_3(int _weight, int _value) {
        setWeight(_weight);
        setValue(_value);
    }
 
    public Item_3(int _weight, int _value, int _bounding) {
        setWeight(_weight);
        setValue(_value);
        setBounding(_bounding);
    }
 
    public Item_3(String _name, int _weight, int _value) {
        setName(_name);
        setWeight(_weight);
        setValue(_value);
    }
 
    public Item_3(String _name, int _weight, int _value, int _bounding) {
        setName(_name);
        setWeight(_weight);
        setValue(_value);
        setBounding(_bounding);
    }
 
    public void setName(String _name) {name = _name;}
    public void setWeight(int _weight) {weight = Math.max(_weight, 0);}
    public void setValue(int _value) {value = Math.max(_value, 0);}
 
    public void setInKnapsack(int _inKnapsack) {
        inKnapsack = Math.min(getBounding(), Math.max(_inKnapsack, 0));
    }
 
    public void setBounding(int _bounding) {
        bounding = Math.max(_bounding, 0);
        if (bounding == 0)
            inKnapsack = 0;
    }
 
    public void checkMembers() {
        setWeight(weight);
        setValue(value);
        setBounding(bounding);
        setInKnapsack(inKnapsack);
    }
 
    public String getName() {return name;}
    public int getWeight() {return weight;}
    public int getValue() {return value;}
    public int getInKnapsack() {return inKnapsack;}
    public int getBounding() {return bounding;}
} // class


