
import java.awt.Color;
import javax.swing.JButton;
import java.util.*;
import java.awt.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pinky
 */
public class NewJFrame extends javax.swing.JFrame {

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
        
        
    
    public NewJFrame() {
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
        
      //  JOptionPane.showMessageDialog(this, "Player "+player+" played "+r);
        if(player==1)
            scorep.setText(Integer.toString(r));
        else
            scorec.setText(Integer.toString(r));
        
        
        if(player==1)
        { 
            makeInvisible(player,p);
            p += r;
            x=p;
            
        }
        else
        {  
            makeInvisible(player,c);
            c += r;
            x=c;
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

        p4.setBackground(new java.awt.Color(255, 0, 51));
        p4.setForeground(new java.awt.Color(255, 0, 51));
        p4.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp1.setBackground(new java.awt.Color(255, 0, 0));
        jp1.setForeground(new java.awt.Color(255, 51, 51));
        jp1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), null));
        jp1.setBorderPainted(false);
        jp1.setContentAreaFilled(false);
        jp1.setOpaque(true);
        jp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jp1ActionPerformed(evt);
            }
        });
        getContentPane().add(jp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 30, 30));

        dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dice (100x100).jpg"))); // NOI18N
        dice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diceActionPerformed(evt);
            }
        });
        getContentPane().add(dice, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 100, 90));

        jc2.setBackground(new java.awt.Color(51, 51, 255));
        jc2.setOpaque(true);
        getContentPane().add(jc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 30, 30));

        jp3.setBackground(new java.awt.Color(255, 0, 51));
        jp3.setOpaque(true);
        getContentPane().add(jp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 30, 30));

        jc3.setBackground(new java.awt.Color(0, 0, 255));
        jc3.setOpaque(true);
        getContentPane().add(jc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 30, 30));

        jp4.setBackground(new java.awt.Color(255, 0, 51));
        jp4.setForeground(new java.awt.Color(255, 0, 51));
        jp4.setOpaque(true);
        getContentPane().add(jp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 30, 30));

        jc4.setBackground(new java.awt.Color(0, 0, 255));
        jc4.setOpaque(true);
        getContentPane().add(jc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 30, 30));

        jp5.setBackground(new java.awt.Color(255, 0, 0));
        jp5.setOpaque(true);
        getContentPane().add(jp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 30, 30));

        jc5.setBackground(new java.awt.Color(51, 51, 255));
        jc5.setOpaque(true);
        getContentPane().add(jc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 30, 30));

        jc10.setBackground(new java.awt.Color(51, 0, 255));
        jc10.setOpaque(true);
        getContentPane().add(jc10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 30, 30));

        jp10.setBackground(new java.awt.Color(255, 0, 0));
        jp10.setOpaque(true);
        getContentPane().add(jp10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 30, 30));

        jp11.setBackground(new java.awt.Color(255, 0, 0));
        jp11.setOpaque(true);
        getContentPane().add(jp11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 30, 30));

        jp13.setBackground(new java.awt.Color(255, 0, 0));
        jp13.setOpaque(true);
        getContentPane().add(jp13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 30, 30));

        jp14.setBackground(new java.awt.Color(255, 0, 0));
        jp14.setOpaque(true);
        getContentPane().add(jp14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 30, 30));

        jp15.setBackground(new java.awt.Color(255, 0, 0));
        jp15.setOpaque(true);
        getContentPane().add(jp15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 30, 30));

        jp16.setBackground(new java.awt.Color(255, 0, 0));
        jp16.setOpaque(true);
        getContentPane().add(jp16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 30, 30));

        jp12.setBackground(new java.awt.Color(255, 0, 0));
        jp12.setOpaque(true);
        getContentPane().add(jp12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 30, 30));

        jp17.setBackground(new java.awt.Color(255, 0, 0));
        jp17.setOpaque(true);
        getContentPane().add(jp17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 30, 30));

        jp18.setBackground(new java.awt.Color(255, 0, 0));
        jp18.setOpaque(true);
        getContentPane().add(jp18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 30, 30));

        jp19.setBackground(new java.awt.Color(255, 0, 0));
        jp19.setOpaque(true);
        getContentPane().add(jp19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 30, 30));

        jp20.setBackground(new java.awt.Color(255, 0, 0));
        jp20.setOpaque(true);
        getContentPane().add(jp20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 30, 30));

        jp21.setBackground(new java.awt.Color(255, 0, 0));
        jp21.setOpaque(true);
        getContentPane().add(jp21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 30, 30));

        jp22.setBackground(new java.awt.Color(255, 0, 0));
        jp22.setOpaque(true);
        getContentPane().add(jp22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 30, 30));

        jp23.setBackground(new java.awt.Color(255, 0, 0));
        jp23.setOpaque(true);
        getContentPane().add(jp23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 30, 30));

        jp24.setBackground(new java.awt.Color(255, 0, 0));
        jp24.setOpaque(true);
        getContentPane().add(jp24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 30, 30));

        jp25.setBackground(new java.awt.Color(255, 0, 0));
        jp25.setOpaque(true);
        getContentPane().add(jp25, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 30, 30));

        jp6.setBackground(new java.awt.Color(255, 0, 0));
        jp6.setOpaque(true);
        getContentPane().add(jp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 30, 30));

        jp9.setBackground(new java.awt.Color(255, 0, 0));
        jp9.setOpaque(true);
        getContentPane().add(jp9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 30, 30));

        jp8.setBackground(new java.awt.Color(255, 0, 0));
        jp8.setOpaque(true);
        getContentPane().add(jp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 30, 30));

        jp7.setBackground(new java.awt.Color(255, 0, 0));
        jp7.setOpaque(true);
        getContentPane().add(jp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 30, 30));

        jc6.setBackground(new java.awt.Color(51, 51, 255));
        jc6.setOpaque(true);
        getContentPane().add(jc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 30, 30));

        jc7.setBackground(new java.awt.Color(51, 51, 255));
        jc7.setOpaque(true);
        getContentPane().add(jc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 30, 30));

        jc8.setBackground(new java.awt.Color(51, 51, 255));
        jc8.setOpaque(true);
        getContentPane().add(jc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 30, 30));

        jc9.setBackground(new java.awt.Color(51, 51, 255));
        jc9.setOpaque(true);
        getContentPane().add(jc9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 30, 30));

        jc11.setBackground(new java.awt.Color(51, 0, 255));
        jc11.setOpaque(true);
        getContentPane().add(jc11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 30, 30));

        jc12.setBackground(new java.awt.Color(51, 0, 255));
        jc12.setOpaque(true);
        getContentPane().add(jc12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 30, 30));

        jc13.setBackground(new java.awt.Color(51, 0, 255));
        jc13.setOpaque(true);
        getContentPane().add(jc13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 30, 30));

        jc14.setBackground(new java.awt.Color(51, 0, 255));
        jc14.setOpaque(true);
        getContentPane().add(jc14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 30, 30));

        jc15.setBackground(new java.awt.Color(51, 0, 255));
        jc15.setOpaque(true);
        getContentPane().add(jc15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 30, 30));

        jc16.setBackground(new java.awt.Color(51, 0, 255));
        jc16.setOpaque(true);
        getContentPane().add(jc16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 30, 30));

        jc17.setBackground(new java.awt.Color(51, 0, 255));
        jc17.setOpaque(true);
        getContentPane().add(jc17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 30, 30));

        jc18.setBackground(new java.awt.Color(51, 0, 255));
        jc18.setOpaque(true);
        getContentPane().add(jc18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 30, 30));

        jc19.setBackground(new java.awt.Color(51, 0, 255));
        jc19.setOpaque(true);
        getContentPane().add(jc19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 30, 30));

        jc20.setBackground(new java.awt.Color(51, 0, 255));
        jc20.setOpaque(true);
        getContentPane().add(jc20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 30, 30));

        jc21.setBackground(new java.awt.Color(51, 0, 255));
        jc21.setOpaque(true);
        getContentPane().add(jc21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 30, 30));

        jc22.setBackground(new java.awt.Color(51, 0, 255));
        jc22.setOpaque(true);
        getContentPane().add(jc22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 30, 30));

        jc23.setBackground(new java.awt.Color(51, 0, 255));
        jc23.setOpaque(true);
        getContentPane().add(jc23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 30, 30));

        jc24.setBackground(new java.awt.Color(51, 0, 255));
        jc24.setOpaque(true);
        getContentPane().add(jc24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 30, 30));

        jc25.setBackground(new java.awt.Color(51, 0, 255));
        jc25.setOpaque(true);
        getContentPane().add(jc25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 30, 30));

        jc1.setBackground(new java.awt.Color(51, 51, 255));
        jc1.setOpaque(true);
        getContentPane().add(jc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 30, 30));

        jp2.setBackground(new java.awt.Color(255, 0, 0));
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
        getContentPane().add(jp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sal2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 440, 430));

        scorec.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(scorec, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 140, 60));

        scorep.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(scorep, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 140, 60));

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        jLabel2.setText("Player 1 rolled :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 230, 80));

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 1, 27)); // NOI18N
        jLabel4.setText("LAST ROLLED");
        jLabel4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 210, 40));

        turnLabel.setFont(new java.awt.Font("Tekton Pro Ext", 1, 20)); // NOI18N
        turnLabel.setText("Player 1's turn");
        getContentPane().add(turnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 170, 140));

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        jLabel3.setText("Player 2 rolled :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 230, 80));

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
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
