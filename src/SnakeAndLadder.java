
import java.util.*;
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.*;
//import org.netbeans.lib.awtextra.AbsoluteConstraints;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pinky
 */
public class SnakeAndLadder extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
        int p=1,c=1;
        int x;
        int r=0;
        int turn =0;
        int player=1;
        Font font;
        int done=0;
        Random rn = new Random();
        
        
    
    public SnakeAndLadder() {
        initComponents();
        
        jp2.setVisible(false);
        jc2.setVisible(false);
        jp3.setVisible(false);
        jc3.setVisible(false);
        jp4.setVisible(false);
        jc4.setVisible(false);
        jp5.setVisible(false);
        jc5.setVisible(false);
        jp6.setVisible(false);
        jc6.setVisible(false);
        jp7.setVisible(false);
        jc7.setVisible(false);
        jp8.setVisible(false);
        jc8.setVisible(false);
        jp9.setVisible(false);
        jc9.setVisible(false); 
        jp10.setVisible(false);
        jc10.setVisible(false);
         jp11.setVisible(false);
        jc11.setVisible(false);
         jp12.setVisible(false);
        jc12.setVisible(false);
         jp13.setVisible(false);
        jc13.setVisible(false);
         jp14.setVisible(false);
        jc14.setVisible(false);
         jp15.setVisible(false);
        jc15.setVisible(false);
         jp16.setVisible(false);
        jc16.setVisible(false);
         jp17.setVisible(false);
        jc17.setVisible(false);
         jp18.setVisible(false);
        jc18.setVisible(false);
         jp19.setVisible(false);
        jc19.setVisible(false);
         jp20.setVisible(false);
        jc20.setVisible(false);
         jp21.setVisible(false);
        jc21.setVisible(false);
         jp22.setVisible(false);
        jc22.setVisible(false);
         jp23.setVisible(false);
        jc23.setVisible(false);
         jp24.setVisible(false);
        jc24.setVisible(false);
         jp25.setVisible(false);
        jc25.setVisible(false);
     }
    public void makeVisible(int player,int n)
    {
         switch(n)
        {
             case 1:
                if(player==1) 
                    jp1.setVisible(true); 
                else
                    jc1.setVisible(true);
                break;
            case 2:
                
                if(player==1) 
                {   jp2.setVisible(true); 
                    makeInvisible(player,2);
                     makeVisible(player,14);
                     p=14;
                }
                else
                {   jc2.setVisible(true);
                    makeInvisible(player,2);
                     makeVisible(player,14);
                     c=14;
                }
                break;
            
            case 3:
                if(player==1) 
                    jp3.setVisible(true); 
                else
                    jc3.setVisible(true);
                break;
            case 4:
                if(player==1) 
                    jp4.setVisible(true); 
                else
                    jc4.setVisible(true);
                break;
            case 5:
                if(player==1) 
                    jp5.setVisible(true); 
                else
                    jc5.setVisible(true);
                break; 
           case 6:
                if(player==1) 
                    jp6.setVisible(true); 
                else
                    jc6.setVisible(true);
                break;
               
           case 7:
                if(player==1) 
                {   jp7.setVisible(true); 
                    makeInvisible(player, 7);
                    makeVisible(player, 3);
                    p=3;
                }
                else
                {   jc7.setVisible(true);
                    makeInvisible(player, 7);
                    makeVisible(player, 3);
                    c=3;
                }
                break;    
        case 8:
                if(player==1) 
                    jp8.setVisible(true); 
                else
                    jc8.setVisible(true);
                break;    
        case 9:
                if(player==1) 
                    jp9.setVisible(true); 
                else
                    jc9.setVisible(true);
                break;    
        case 10:
                if(player==1) 
                    jp10.setVisible(true); 
                else
                    jc10.setVisible(true);
                break;    
        case 11:
                if(player==1) 
                { jp11.setVisible(true); 
                makeInvisible(player,11);
                     makeVisible(player,19);
                     p=19;
                }
                else
                {   jc11.setVisible(true);
                makeInvisible(player,11);
                     makeVisible(player,19);
                     c=19;
                }
                break;    
        case 12:
                if(player==1) 
                {    jp12.setVisible(true); 
                    makeInvisible(player, 12);
                    makeVisible(player, 8);
                    p=8;
                }
                else
                {
                    jc12.setVisible(true);
                    makeInvisible(player, 12);
                    makeVisible(player, 8);
                    c=8;
                }
                break;    
        case 13:
                if(player==1) 
                    jp13.setVisible(true); 
                else
                    jc13.setVisible(true);
                break;    
        case 14:
                if(player==1) 
                    jp14.setVisible(true); 
                else
                    jc14.setVisible(true);
                break;    
        case 15:
                if(player==1) 
                    jp15.setVisible(true); 
                else
                    jc15.setVisible(true);
                break;    
        case 16:
                if(player==1) 
                {    jp16.setVisible(true); 
                    makeInvisible(player, 16);
                    makeVisible(player, 24);
                    p=24;
                }
                else
                {   jc16.setVisible(true);
                    makeInvisible(player, 16);
                    makeVisible(player, 24);
                    c=24;
                }
                break;    
        case 17:
                if(player==1) 
                    jp17.setVisible(true); 
                else
                    jc17.setVisible(true);
                break;    
        case 18:
                if(player==1) 
                    jp18.setVisible(true); 
                else
                    jc18.setVisible(true);
                break;    
        case 19:
                if(player==1) 
                    jp19.setVisible(true); 
                else
                    jc19.setVisible(true);
                break;    
        case 20:
                if(player==1) 
                    jp20.setVisible(true); 
                else
                    jc20.setVisible(true);
                break;    
        case 21:
                if(player==1) 
                    jp21.setVisible(true); 
                else
                    jc21.setVisible(true);
                break;    
        case 22:
                if(player==1) 
                    jp22.setVisible(true); 
                else
                    jc22.setVisible(true);
                break;    
        case 23:
                if(player==1) 
                {   jp23.setVisible(true); 
                    makeInvisible(player, 23);
                    makeVisible(player, 15);
                    p=15;
                }
                else
                {    jc23.setVisible(true);
                    makeInvisible(player, 23);
                    makeVisible(player, 15);
                    c=15;
                }
                break;    
        case 24:
                if(player==1) 
                    jp24.setVisible(true); 
                else
                    jc24.setVisible(true);
                break;    
        case 25:
                if(player==1) 
                    jp25.setVisible(true); 
                else
                    jc25.setVisible(true);
                break;    
        
        
        }
    }
    public void makeInvisible(int player,int n)
    {
         switch(n)
       {
             case 1:
                if(player==1) 
                    jp1.setVisible(false); 
                else
                    jc1.setVisible(false);
                break;
            case 2:
                if(player==1) 
                    jp2.setVisible(false); 
                else
                    jc2.setVisible(false);
                break;
            
            case 3:
                if(player==1) 
                    jp3.setVisible(false); 
                else
                    jc3.setVisible(false);
                break;
            case 4:
                if(player==1) 
                    jp4.setVisible(false); 
                else
                    jc4.setVisible(false);
                break;
            case 5:
                if(player==1) 
                    jp5.setVisible(false); 
                else
                    jc5.setVisible(false);
                break; 
           case 6:
                if(player==1) 
                    jp6.setVisible(false); 
                else
                    jc6.setVisible(false);
                break;
               
           case 7:
                if(player==1) 
                    jp7.setVisible(false); 
               else
                  jc7.setVisible(false);
                break;    
        case 8:
                if(player==1) 
                    jp8.setVisible(false); 
                else
                    jc8.setVisible(false);
                break;    
        case 9:
                if(player==1) 
                    jp9.setVisible(false); 
                else
                    jc9.setVisible(false);
                break;    
        case 10:
                if(player==1) 
                    jp10.setVisible(false); 
                else
                    jc10.setVisible(false);
                break;    
        case 11:
                if(player==1) 
                    jp11.setVisible(false); 
                else
                    jc11.setVisible(false);
                break;    
        case 12:
                if(player==1) 
                    jp12.setVisible(false); 
                else
                    jc12.setVisible(false);
                break;    
        case 13:
                if(player==1) 
                    jp13.setVisible(false); 
                else
                    jc13.setVisible(false);
                break;    
        case 14:
                if(player==1) 
                    jp14.setVisible(false); 
                else
                    jc14.setVisible(false);
                break;    
        case 15:
                if(player==1) 
                    jp15.setVisible(false); 
                else
                    jc15.setVisible(false);
                break;    
        case 16:
                if(player==1) 
                    jp16.setVisible(false); 
                else
                    jc16.setVisible(false);
                break;    
        case 17:
                if(player==1) 
                    jp17.setVisible(false); 
                else
                    jc17.setVisible(false);
                break;    
        case 18:
                if(player==1) 
                    jp18.setVisible(false); 
                else
                    jc18.setVisible(false);
                break;    
        case 19:
                if(player==1) 
                    jp19.setVisible(false); 
                else
                    jc19.setVisible(false);
                break;    
        case 20:
                if(player==1) 
                    jp20.setVisible(false); 
                else
                    jc20.setVisible(false);
                break;    
        case 21:
                if(player==1) 
                    jp21.setVisible(false); 
                else
                    jc21.setVisible(false);
                break;    
        case 22:
                if(player==1) 
                    jp22.setVisible(false); 
                else
                    jc22.setVisible(false);
                break;    
        case 23:
                if(player==1) 
                    jp23.setVisible(false); 
                else
                    jc23.setVisible(false);
                 
                break;    
        case 24:
                if(player==1) 
                    jp24.setVisible(false); 
                else
                    jc24.setVisible(false);
                break;    
        case 25:
                if(player==1) 
                    jp25.setVisible(false); 
                else
                    jc25.setVisible(false);
                break;    
        
        
        }
    }
    public void setTurn()
    {
        turn = 1-turn;
         if(turn == 1)
            player = 2;
        else
            player = 1;
    }
    public void play()
    {
        r= rn.nextInt(6)+1;
        
        if(player==1)
            turnLabel.setText("Player 2's turn");
        else
            turnLabel.setText("Player 1's turn");

        if(player==1)
        { 
            makeInvisible(player,p);
            p += r;
            x=p;
            scorep.setText(Integer.toString(p));
            jLabel2.setText("Player 1's last roll: " + r);
        }
        else
        {  
            makeInvisible(player,c);
            c += r;
            x=c;
            scorec.setText(Integer.toString(c));
            jLabel3.setText("Player 2's last roll: " + r);
        }
       // JOptionPane.showMessageDialog(this, "Player "+player+" total : "+x);
        makeVisible(player, x);
        if(x>=25)
        {
            font = new Font("Comic Sans", Font.BOLD, 20);
            JOptionPane jp = new JOptionPane();
            jp.setFont(font);
            jp.showMessageDialog(this,"GAME OVER \n Player "+player+" won!!");
            done =1;
            return;
        }
        setTurn();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p4 = new javax.swing.JLabel();
        jp1 = new javax.swing.JButton();
        javax.swing.JButton dice = new javax.swing.JButton();
        jc2 = new javax.swing.JLabel();
        jp3 = new javax.swing.JLabel();
        jc3 = new javax.swing.JLabel();
        jp4 = new javax.swing.JLabel();
        jc4 = new javax.swing.JLabel();
        jp5 = new javax.swing.JLabel();
        jc5 = new javax.swing.JLabel();
        jc10 = new javax.swing.JLabel();
        jp10 = new javax.swing.JLabel();
        jp11 = new javax.swing.JLabel();
        jp13 = new javax.swing.JLabel();
        jp14 = new javax.swing.JLabel();
        jp15 = new javax.swing.JLabel();
        jp16 = new javax.swing.JLabel();
        jp12 = new javax.swing.JLabel();
        jp17 = new javax.swing.JLabel();
        jp18 = new javax.swing.JLabel();
        jp19 = new javax.swing.JLabel();
        jp20 = new javax.swing.JLabel();
        jp21 = new javax.swing.JLabel();
        jp22 = new javax.swing.JLabel();
        jp23 = new javax.swing.JLabel();
        jp24 = new javax.swing.JLabel();
        jp25 = new javax.swing.JLabel();
        jp6 = new javax.swing.JLabel();
        jp9 = new javax.swing.JLabel();
        jp8 = new javax.swing.JLabel();
        jp7 = new javax.swing.JLabel();
        jc6 = new javax.swing.JLabel();
        jc7 = new javax.swing.JLabel();
        jc8 = new javax.swing.JLabel();
        jc9 = new javax.swing.JLabel();
        jc11 = new javax.swing.JLabel();
        jc12 = new javax.swing.JLabel();
        jc13 = new javax.swing.JLabel();
        jc14 = new javax.swing.JLabel();
        jc15 = new javax.swing.JLabel();
        jc16 = new javax.swing.JLabel();
        jc17 = new javax.swing.JLabel();
        jc18 = new javax.swing.JLabel();
        jc19 = new javax.swing.JLabel();
        jc20 = new javax.swing.JLabel();
        jc21 = new javax.swing.JLabel();
        jc22 = new javax.swing.JLabel();
        jc23 = new javax.swing.JLabel();
        jc24 = new javax.swing.JLabel();
        jc25 = new javax.swing.JLabel();
        jc1 = new javax.swing.JLabel();
        jp2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scorec = new javax.swing.JTextField();
        scorep = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        turnLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        p4.setIcon(new ImageIcon("blue_48.png"));
        p4.setForeground(new java.awt.Color(255, 0, 51));
        p4.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new AbsoluteLayout());

        try{
            jp1.setIcon(new ImageIcon("blue_48.png"));

        }
        catch (Exception ex){
            java.util.logging.Logger.getLogger(SnakeAndLadder.class.getName()).log(java.util.logging.Level.SEVERE, "couldnt load image", ex);
        }
//        jp1.setForeground(new java.awt.Color(255, 51, 51));
        jp1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), null));
        jp1.setBorderPainted(false);
        jp1.setContentAreaFilled(false);
        jp1.setOpaque(true);
        jp1.addActionListener(evt -> jp1ActionPerformed(evt));
        getContentPane().add(jp1, new AbsoluteConstraints(60, 310, 26, 26));

        scorep.setText(Integer.toString(1));
        scorec.setText(Integer.toString(1));

        dice.setIcon(new ImageIcon("dice.jpg")); // NOI18N
        dice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diceActionPerformed(evt);
            }
        });
        getContentPane().add(dice, new AbsoluteConstraints(450, 180, 100, 90));

        jc2.setIcon(new ImageIcon("green_48.png"));
        jc2.setOpaque(true);
        getContentPane().add(jc2, new AbsoluteConstraints(150, 340, 26, 26));

        jp3.setIcon(new ImageIcon("blue_48.png"));
        jp3.setOpaque(true);
        getContentPane().add(jp3, new AbsoluteConstraints(190, 310, 26, 26));

        jc3.setIcon(new ImageIcon("green_48.png"));
        jc3.setOpaque(true);
        getContentPane().add(jc3, new AbsoluteConstraints(220, 340, 26, 26));

        jp4.setIcon(new ImageIcon("blue_48.png"));
        jp4.setOpaque(true);
        getContentPane().add(jp4, new AbsoluteConstraints(250, 310, 26, 26));

        jc4.setIcon(new ImageIcon("green_48.png"));
        jc4.setOpaque(true);
        getContentPane().add(jc4, new AbsoluteConstraints(280, 340, 26, 26));

        jp5.setIcon(new ImageIcon("blue_48.png"));
        jp5.setOpaque(true);
        getContentPane().add(jp5, new AbsoluteConstraints(310, 310, 26, 26));

        jc5.setIcon(new ImageIcon("green_48.png"));
        jc5.setOpaque(true);
        getContentPane().add(jc5, new AbsoluteConstraints(340, 340, 26, 26));

        jc10.setIcon(new ImageIcon("green_48.png"));
        jc10.setOpaque(true);
        getContentPane().add(jc10, new AbsoluteConstraints(90, 280, 26, 26));

        jp10.setIcon(new ImageIcon("blue_48.png"));
        jp10.setOpaque(true);
        getContentPane().add(jp10, new AbsoluteConstraints(60, 250, 26, 26));

        jp11.setIcon(new ImageIcon("blue_48.png"));
        jp11.setOpaque(true);
        getContentPane().add(jp11, new AbsoluteConstraints(60, 180, 26, 26));

        jp13.setIcon(new ImageIcon("blue_48.png"));
        jp13.setOpaque(true);
        getContentPane().add(jp13, new AbsoluteConstraints(180, 190, 26, 26));

        jp14.setIcon(new ImageIcon("blue_48.png"));
        jp14.setOpaque(true);
        getContentPane().add(jp14, new AbsoluteConstraints(250, 190, 26, 26));

        jp15.setIcon(new ImageIcon("blue_48.png"));
        jp15.setOpaque(true);
        getContentPane().add(jp15, new AbsoluteConstraints(310, 190, 26, 26));

        jp16.setIcon(new ImageIcon("blue_48.png"));
        jp16.setOpaque(true);
        getContentPane().add(jp16, new AbsoluteConstraints(310, 120, 26, 26));

        jp12.setIcon(new ImageIcon("blue_48.png"));
        jp12.setOpaque(true);
        getContentPane().add(jp12, new AbsoluteConstraints(120, 180, 26, 26));

        jp17.setIcon(new ImageIcon("blue_48.png"));
        jp17.setOpaque(true);
        getContentPane().add(jp17, new AbsoluteConstraints(250, 120, 26, 26));

        jp18.setIcon(new ImageIcon("blue_48.png"));
        jp18.setOpaque(true);
        getContentPane().add(jp18, new AbsoluteConstraints(180, 120, 26, 26));

        jp19.setIcon(new ImageIcon("blue_48.png"));
        jp19.setOpaque(true);
        getContentPane().add(jp19, new AbsoluteConstraints(120, 120, 26, 26));

        jp20.setIcon(new ImageIcon("blue_48.png"));
        jp20.setOpaque(true);
        getContentPane().add(jp20, new AbsoluteConstraints(60, 120, 26, 26));

        jp21.setIcon(new ImageIcon("blue_48.png"));
        jp21.setOpaque(true);
        getContentPane().add(jp21, new AbsoluteConstraints(60, 60, 26, 26));

        jp22.setIcon(new ImageIcon("blue_48.png"));
        jp22.setOpaque(true);
        getContentPane().add(jp22, new AbsoluteConstraints(120, 60, 26, 26));

        jp23.setIcon(new ImageIcon("blue_48.png"));
        jp23.setOpaque(true);
        getContentPane().add(jp23, new AbsoluteConstraints(180, 60, 26, 26));

        jp24.setIcon(new ImageIcon("blue_48.png"));
        jp24.setOpaque(true);
        getContentPane().add(jp24, new AbsoluteConstraints(250, 60, 26, 26));

        jp25.setIcon(new ImageIcon("blue_48.png"));
        jp25.setOpaque(true);
        getContentPane().add(jp25, new AbsoluteConstraints(310, 60, 26, 26));

        jp6.setIcon(new ImageIcon("blue_48.png"));
        jp6.setOpaque(true);
        getContentPane().add(jp6, new AbsoluteConstraints(310, 250, 26, 26));

        jp9.setIcon(new ImageIcon("blue_48.png"));
        jp9.setOpaque(true);
        getContentPane().add(jp9, new AbsoluteConstraints(120, 250, 26, 26));

        jp8.setIcon(new ImageIcon("blue_48.png"));
        jp8.setOpaque(true);
        getContentPane().add(jp8, new AbsoluteConstraints(190, 250, 26, 26));

        jp7.setIcon(new ImageIcon("blue_48.png"));
        jp7.setOpaque(true);
        getContentPane().add(jp7, new AbsoluteConstraints(250, 250, 26, 26));

        jc6.setIcon(new ImageIcon("green_48.png"));
        jc6.setOpaque(true);
        getContentPane().add(jc6, new AbsoluteConstraints(340, 280, 26, 26));

        jc7.setIcon(new ImageIcon("green_48.png"));
        jc7.setOpaque(true);
        getContentPane().add(jc7, new AbsoluteConstraints(280, 280, 26, 26));

        jc8.setIcon(new ImageIcon("green_48.png"));
        jc8.setOpaque(true);
        getContentPane().add(jc8, new AbsoluteConstraints(220, 280, 26, 26));

        jc9.setIcon(new ImageIcon("green_48.png"));
        jc9.setOpaque(true);
        getContentPane().add(jc9, new AbsoluteConstraints(160, 280, 26, 26));

        jc11.setIcon(new ImageIcon("green_48.png"));
        jc11.setOpaque(true);
        getContentPane().add(jc11, new AbsoluteConstraints(90, 220, 26, 26));

        jc12.setIcon(new ImageIcon("green_48.png"));
        jc12.setOpaque(true);
        getContentPane().add(jc12, new AbsoluteConstraints(150, 220, 26, 26));

        jc13.setIcon(new ImageIcon("green_48.png"));
        jc13.setOpaque(true);
        getContentPane().add(jc13, new AbsoluteConstraints(220, 220, 26, 26));

        jc14.setIcon(new ImageIcon("green_48.png"));
        jc14.setOpaque(true);
        getContentPane().add(jc14, new AbsoluteConstraints(280, 220, 26, 26));

        jc15.setIcon(new ImageIcon("green_48.png"));
        jc15.setOpaque(true);
        getContentPane().add(jc15, new AbsoluteConstraints(340, 220, 26, 26));

        jc16.setIcon(new ImageIcon("green_48.png"));
        jc16.setOpaque(true);
        getContentPane().add(jc16, new AbsoluteConstraints(340, 150, 26, 26));

        jc17.setIcon(new ImageIcon("green_48.png"));
        jc17.setOpaque(true);
        getContentPane().add(jc17, new AbsoluteConstraints(280, 150, 26, 26));

        jc18.setIcon(new ImageIcon("green_48.png"));
        jc18.setOpaque(true);
        getContentPane().add(jc18, new AbsoluteConstraints(220, 150, 26, 26));

        jc19.setIcon(new ImageIcon("green_48.png"));
        jc19.setOpaque(true);
        getContentPane().add(jc19, new AbsoluteConstraints(150, 150, 26, 26));

        jc20.setIcon(new ImageIcon("green_48.png"));
        jc20.setOpaque(true);
        getContentPane().add(jc20, new AbsoluteConstraints(90, 150, 26, 26));

        jc21.setIcon(new ImageIcon("green_48.png"));
        jc21.setOpaque(true);
        getContentPane().add(jc21, new AbsoluteConstraints(90, 90, 26, 26));

        jc22.setIcon(new ImageIcon("green_48.png"));
        jc22.setOpaque(true);
        getContentPane().add(jc22, new AbsoluteConstraints(150, 90, 26, 26));

        jc23.setIcon(new ImageIcon("green_48.png"));
        jc23.setOpaque(true);
        getContentPane().add(jc23, new AbsoluteConstraints(220, 90, 26, 26));

        jc24.setIcon(new ImageIcon("green_48.png"));
        jc24.setOpaque(true);
        getContentPane().add(jc24, new AbsoluteConstraints(280, 90, 26, 26));

        jc25.setIcon(new ImageIcon("green_48.png"));
        jc25.setOpaque(true);
        getContentPane().add(jc25, new AbsoluteConstraints(340, 90, 26, 26));

        jc1.setIcon(new ImageIcon("green_48.png"));
        jc1.setOpaque(true);
        getContentPane().add(jc1, new AbsoluteConstraints(90, 340, 26, 26));

        jp2.setIcon(new ImageIcon("blue_48.png"));
        jp2.setForeground(new java.awt.Color(255, 51, 51));
        jp2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), null));
        jp2.setBorderPainted(false);
        jp2.setContentAreaFilled(false);
        jp2.setOpaque(true);
        jp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jp2ActionPerformed(evt);
            }
        });
        getContentPane().add(jp2, new AbsoluteConstraints(120, 310, 26, 26));

        jLabel1.setIcon(new ImageIcon("sal2.jpg")); // NOI18N
        getContentPane().add(jLabel1, new AbsoluteConstraints(0, -10, 440, 430));

        scorec.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(scorec, new AbsoluteConstraints(640, 300, 140, 60));

        scorep.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(scorep, new AbsoluteConstraints(640, 130, 140, 60));

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel2.setText("Player 1");
        getContentPane().add(jLabel2, new AbsoluteConstraints(610, 80, 230, 80));

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 1, 27)); // NOI18N
        jLabel4.setText("LAST ROLLED");
        jLabel4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel4, new AbsoluteConstraints(620, 40, 210, 40));

        turnLabel.setFont(new java.awt.Font("Tekton Pro Ext", 1, 20)); // NOI18N
        turnLabel.setText("Player 1's turn");
        getContentPane().add(turnLabel, new AbsoluteConstraints(430, 90, 170, 140));

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 0, 20)); // NOI18N
        jLabel3.setText("Player 2");
        getContentPane().add(jLabel3, new AbsoluteConstraints(610, 250, 230, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jp1ActionPerformed

    private void diceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diceActionPerformed

        play();
     
       
    }//GEN-LAST:event_diceActionPerformed

    private void jp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jp2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SnakeAndLadder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SnakeAndLadder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SnakeAndLadder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SnakeAndLadder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SnakeAndLadder().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jc1;
    private javax.swing.JLabel jc10;
    private javax.swing.JLabel jc11;
    private javax.swing.JLabel jc12;
    private javax.swing.JLabel jc13;
    private javax.swing.JLabel jc14;
    private javax.swing.JLabel jc15;
    private javax.swing.JLabel jc16;
    private javax.swing.JLabel jc17;
    private javax.swing.JLabel jc18;
    private javax.swing.JLabel jc19;
    private javax.swing.JLabel jc2;
    private javax.swing.JLabel jc20;
    private javax.swing.JLabel jc21;
    private javax.swing.JLabel jc22;
    private javax.swing.JLabel jc23;
    private javax.swing.JLabel jc24;
    private javax.swing.JLabel jc25;
    private javax.swing.JLabel jc3;
    private javax.swing.JLabel jc4;
    private javax.swing.JLabel jc5;
    private javax.swing.JLabel jc6;
    private javax.swing.JLabel jc7;
    private javax.swing.JLabel jc8;
    private javax.swing.JLabel jc9;
    private javax.swing.JButton jp1;
    private javax.swing.JLabel jp10;
    private javax.swing.JLabel jp11;
    private javax.swing.JLabel jp12;
    private javax.swing.JLabel jp13;
    private javax.swing.JLabel jp14;
    private javax.swing.JLabel jp15;
    private javax.swing.JLabel jp16;
    private javax.swing.JLabel jp17;
    private javax.swing.JLabel jp18;
    private javax.swing.JLabel jp19;
    private javax.swing.JButton jp2;
    private javax.swing.JLabel jp20;
    private javax.swing.JLabel jp21;
    private javax.swing.JLabel jp22;
    private javax.swing.JLabel jp23;
    private javax.swing.JLabel jp24;
    private javax.swing.JLabel jp25;
    private javax.swing.JLabel jp3;
    private javax.swing.JLabel jp4;
    private javax.swing.JLabel jp5;
    private javax.swing.JLabel jp6;
    private javax.swing.JLabel jp7;
    private javax.swing.JLabel jp8;
    private javax.swing.JLabel jp9;
    private javax.swing.JLabel p4;
    private javax.swing.JTextField scorec;
    private javax.swing.JTextField scorep;
    private javax.swing.JLabel turnLabel;
    // End of variables declaration//GEN-END:variables
}
