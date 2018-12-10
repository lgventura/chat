
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {
    
    Comunica conexao = new Comunica();
    final String broadcast="192.168.5.255";
    static final int porta = 8756;
    static boolean logado = false;
    String nick;
    int position = 0;
    
    public Principal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        listaContatos = new java.awt.List();
        jScrollPane1 = new javax.swing.JScrollPane();
        areadaMensagem = new javax.swing.JTextArea();
        textDigitado = new javax.swing.JTextField();
        botaoEnviar = new javax.swing.JButton();
        botaoLogof = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        labelNick2 = new javax.swing.JLabel();
        labelSetNick = new javax.swing.JLabel();
        listaIp = new java.awt.List();
        labelIp = new javax.swing.JLabel();
        labelSetIP = new javax.swing.JLabel();
        listContatos = new javax.swing.JLabel();
        listaFlags = new java.awt.List();
        textNick = new javax.swing.JTextField();
        labelChat = new javax.swing.JLabel();
        labelNick = new javax.swing.JLabel();
        botaoLogar = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("Chat");
        jFrame1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jFrame1.setSize(new java.awt.Dimension(1000, 500));

        listaContatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaContatosActionPerformed(evt);
            }
        });

        areadaMensagem.setColumns(20);
        areadaMensagem.setRows(5);
        jScrollPane1.setViewportView(areadaMensagem);

        textDigitado.setText("Digite a Mensagem");
        textDigitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDigitadoActionPerformed(evt);
            }
        });

        botaoEnviar.setText("Enviar");
        botaoEnviar.setToolTipText("");
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
            }
        });

        botaoLogof.setText("Logof");
        botaoLogof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogofActionPerformed(evt);
            }
        });

        labelTitulo.setText("Chat Faculdade");

        labelNick2.setText("Nick:");

        labelSetNick.setText("jLabel5");

        listaIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaIpActionPerformed(evt);
            }
        });

        labelIp.setText("IP:");

        labelSetIP.setText("jLabel7");

        listContatos.setText("CONTATOS");

        listaFlags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaFlagsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(textDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaContatos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listContatos)))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(labelNick2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSetNick)
                                .addGap(127, 127, 127)
                                .addComponent(labelIp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSetIP))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addComponent(labelTitulo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoLogof, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaIp, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaFlags, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNick2)
                            .addComponent(labelSetNick)
                            .addComponent(labelIp)
                            .addComponent(labelSetIP))
                        .addGap(18, 18, 18))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoLogof)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDigitado)
                            .addComponent(botaoEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(listContatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listaIp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                            .addComponent(listaContatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listaFlags, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        listaContatos.getAccessibleContext().setAccessibleParent(this);
        labelSetNick.getAccessibleContext().setAccessibleParent(this);
        listaIp.getAccessibleContext().setAccessibleParent(this);

        jFrame1.getAccessibleContext().setAccessibleParent(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNickActionPerformed(evt);
            }
        });

        labelChat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelChat.setText("Chat COMUNICA");

        labelNick.setText("Digite Seu Nick");

        botaoLogar.setText("Logar");
        botaoLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNick)
                            .addComponent(textNick, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(botaoLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(labelChat, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelChat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(labelNick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textNick, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(botaoLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        textNick.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogarActionPerformed
        RecebeMsg recebe = new RecebeMsg();
        EnviarP enviar = new EnviarP();
        String logon = "";
        logado = true;
        int cont = 0;
        
        nick = textNick.getText();
        logon = "L"+nick;
        
        recebe.start();
        conexao.enviarMensagem(broadcast, porta,logon );
        
        labelSetNick.setText(nick);
        try {
            labelSetIP.setText(InetAddress.getLocalHost().getHostAddress());
        } catch (Exception e) {}
        
        //listaContatos.add("BROADCAST");
        //listaIp.add(broadcast);
        jFrame1.setVisible(true);
        setVisible(false);
        
        enviar.start();
    }//GEN-LAST:event_botaoLogarActionPerformed

    private void listaContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaContatosActionPerformed
        listaContatos.getActionListeners();
        position = listaContatos.getSelectedIndex();
    }//GEN-LAST:event_listaContatosActionPerformed

    private void textDigitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDigitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDigitadoActionPerformed

    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed
       String mensagem="", m_msg="", ip="", enviar ="";
      
       mensagem = textDigitado.getText();
       
       m_msg ="\t\t\t\t" + labelSetNick.getText()+" - Disse: "+"Para: "+listaContatos.getItem(position)+"\n\t\t\t\t"+mensagem+"\n\n";
       
       areadaMensagem.append(m_msg);
       m_msg = "";
       enviar="M"+mensagem;
       
       ip = listaIp.getItem(position);
       conexao.enviarMensagem(ip, porta, enviar);
    }//GEN-LAST:event_botaoEnviarActionPerformed

    private void botaoLogofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogofActionPerformed
        String ip = "", logof = "";
        
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {}
           
            logof="F"+ip;
            
            conexao.enviarMensagem(broadcast, porta, logof);
            logado = false;
            jFrame1.setVisible(false);
            setVisible(true);
            listaContatos.removeAll();
            listaIp.removeAll();
    }//GEN-LAST:event_botaoLogofActionPerformed

    private void listaIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaIpActionPerformed
       
    }//GEN-LAST:event_listaIpActionPerformed

    private void textNickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNickActionPerformed

    private void listaFlagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaFlagsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaFlagsActionPerformed

   
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public class RecebeMsg extends Thread{
        @Override
        
       
        public void run(){
            try {
            DatagramSocket conectar = new DatagramSocket(8756);
            DatagramPacket pacote_recebimento;
            byte[] msg_recebimento = new byte[255];
        
            System.out.println("Receber");
            String ip_remetente="";
            String proto="", msg = "";
                if(logado){
                     while(true){
                       
                        pacote_recebimento = new DatagramPacket(msg_recebimento, msg_recebimento.length);
                        conectar.receive(pacote_recebimento);
               
                        System.out.println("Receber");
                        msg = new String(pacote_recebimento.getData());
                        proto = msg.substring(0,1);
                        msg = msg.substring(1,pacote_recebimento.getLength());
                        ip_remetente = pacote_recebimento.getAddress().toString();
                        ip_remetente = ip_remetente.substring(1);
                        
                        if(proto.equals("L")){

                            if(ip_remetente.equals(InetAddress.getLocalHost().getHostAddress())){ // teste para ver se o seu IP nao enviou para vc mesmo
                                   System.out.println("esse é o seu ip? "+ip_remetente); // Teste
                            }else {
                                listaContatos.add(msg);
                                listaIp.add(ip_remetente);
                                listaFlags.add("5");
                                String toLogado = "O"+nick;

                                conexao.enviarMensagem(ip_remetente, porta, toLogado);
                            }
                        }
                        if(proto.equals("O")){
                            
                          listaContatos.add(msg);
                          listaIp.add(ip_remetente);
                          listaFlags.add("5");
                        }
                        if(proto.equals("F")){
                           for(int aux = 0; aux <= listaIp.getRows(); aux++ ){ 

                                if(msg.equals(listaIp.getItem(aux))){
                                    listaIp.delItem(aux); 
                                    listaContatos.delItem(aux); 
                                    listaFlags.delItem(aux);
                                }
                            }
                        }
                        if(proto.equals("M")){
                            String mensagem_r="", nick="";
                            
                           
                                int teste1 = 0, aux1 = 0;

                                  while(teste1 != 1 || aux1 <= listaIp.getRows() ){ // laço para achar o nick pelo ip recebido

                                    if(ip_remetente.equals(listaIp.getItem(aux1))){ // se ip for igual ao da lista
                                        nick = listaContatos.getItem(aux1); // pega o NICK
                                        teste1 = 1;
                                        break;
                                    }
                                    System.out.println("TESTE");
                                    aux1++;
                                  }
                                  
                               System.out.println("TESTE2");
                            mensagem_r ="\n\n" + nick +" | IP: "+ip_remetente+" - Disse: "+"\n"+msg;

                            areadaMensagem.append(mensagem_r);

                        }
                        if(proto.equals("P")){
                                
                                conexao.enviarMensagem(ip_remetente, porta, "R");
                        }
                        if(proto.equals("R")){

                           for(int aux = 0; aux < listaFlags.countItems(); aux++ ){ 
                               
                                if(ip_remetente.equals(listaIp.getItem(aux))){
                                    
                                    System.out.println("Recebendo R");
                                    listaFlags.replaceItem("5", aux);
                                }
                            }
                        }
                         
            }
            }else {
                conectar.close();
                System.out.println("Fechando a conexão");
            }

           } catch (Exception e) {}
        }

    }
    
public class EnviarP extends Thread{
    @Override
        
       
    public void run(){
        if(logado){
                while(true){
                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {}
                    System.out.println("Enviar P");
                    int aux = 0;        
                
                    for(aux = 0; aux < listaIp.countItems(); aux++ ){ 
                        String ipp = listaIp.getItem(aux);
                        System.out.println(ipp);    
                        conexao.enviarMensagem(ipp, porta, "P");
                        String flag = listaFlags.getItem(aux);
                        int cont = Integer.parseInt(flag);
                        cont--;
                        flag = Integer.toString(cont);
                        listaFlags.replaceItem(flag, aux);

                        if(listaFlags.getItem(aux).equals("0")){

                            listaIp.delItem(aux); 
                            listaContatos.delItem(aux);
                            listaFlags.delItem(aux);

                        }
                    }
                }
        }

    }
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areadaMensagem;
    private javax.swing.JButton botaoEnviar;
    private static javax.swing.JButton botaoLogar;
    private javax.swing.JButton botaoLogof;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelChat;
    private javax.swing.JLabel labelIp;
    private javax.swing.JLabel labelNick;
    private javax.swing.JLabel labelNick2;
    private javax.swing.JLabel labelSetIP;
    private javax.swing.JLabel labelSetNick;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel listContatos;
    private java.awt.List listaContatos;
    private java.awt.List listaFlags;
    private java.awt.List listaIp;
    private javax.swing.JTextField textDigitado;
    private javax.swing.JTextField textNick;
    // End of variables declaration//GEN-END:variables
}
