/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainWindow.java
 *
 * Created on Oct 17, 2010, 6:03:53 PM
 */

package boardgame;
import capturegame.board.*;
import java.util.Stack;
/**
 * The Main (and only) Window of the Go game.
 *
 * @author Fergal Hainey
 */
public class MainWindow extends javax.swing.JFrame {

    /** Creates new form MainWindow */
    public MainWindow() {
        this.currentColour = Board.BLACK;
        this.undoStack = new Stack<Move>();
        this.redoStack = new Stack<Move>();
        initComponents();
        this.errorLabel.setText("");
        final MainWindow mainWindow = this;
        this.boardView.addMoveListener(new MoveListener() {

            public void moveEvent(int x, int y) {
                mainWindow.makeMove(x, y);
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boardView = new capturegame.board.BoardView();
        xLabel = new javax.swing.JLabel();
        xText = new javax.swing.JTextField();
        yLabel = new javax.swing.JLabel();
        yText = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        colourLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        redoButton = new javax.swing.JButton();
        endButton = new javax.swing.JButton();
        moveLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        org.jdesktop.layout.GroupLayout boardViewLayout = new org.jdesktop.layout.GroupLayout(boardView);
        boardView.setLayout(boardViewLayout);
        boardViewLayout.setHorizontalGroup(
            boardViewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );
        boardViewLayout.setVerticalGroup(
            boardViewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        xLabel.setText("x:");

        xText.setPreferredSize(new java.awt.Dimension(30, 20));
        xText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonAndOthersActionPerformed(evt);
            }
        });
        xText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                focusOnY(evt);
            }
        });

        yLabel.setText("y:");

        yText.setMinimumSize(new java.awt.Dimension(30, 20));
        yText.setPreferredSize(new java.awt.Dimension(30, 20));
        yText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonAndOthersActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonAndOthersActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setText("Error");

        colourLabel.setText("Black's move");

        startButton.setText("<<");
        startButton.setEnabled(false);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        undoButton.setText("<");
        undoButton.setEnabled(false);
        undoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoButtonActionPerformed(evt);
            }
        });

        redoButton.setText(">");
        redoButton.setEnabled(false);
        redoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoButtonActionPerformed(evt);
            }
        });

        endButton.setText(">>");
        endButton.setEnabled(false);
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });

        moveLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        moveLabel.setText("Move 0/0");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, boardView, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .add(layout.createSequentialGroup()
                                .add(xLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(xText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(yLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(yText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(submitButton))
                            .add(errorLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(colourLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 130, Short.MAX_VALUE)
                        .add(moveLabel)
                        .add(49, 49, 49))
                    .add(layout.createSequentialGroup()
                        .add(startButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(undoButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(redoButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(endButton)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(boardView, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(colourLabel)
                    .add(moveLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(xLabel)
                    .add(xText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(yLabel)
                    .add(yText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(submitButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(errorLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(startButton)
                    .add(undoButton)
                    .add(redoButton)
                    .add(endButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonAndOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonAndOthersActionPerformed
        makeMove();
    }//GEN-LAST:event_submitButtonAndOthersActionPerformed

    private void focusOnY(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_focusOnY
        this.yText.requestFocus();
    }//GEN-LAST:event_focusOnY

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // Undo everything in the undoStack, and pile on to the redoStack.
        while (!this.undoStack.isEmpty()) {
            Move currentMove = this.undoStack.pop();
            this.undoMove(currentMove);
            this.redoStack.add(currentMove);
        }
        this.updateUndoGUI();
    }//GEN-LAST:event_startButtonActionPerformed

    private void undoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoButtonActionPerformed
        // Undo the last move, and add it to the redoStack.
        Move currentMove = this.undoStack.pop();
        this.undoMove(currentMove);
        this.redoStack.add(currentMove);
        this.updateUndoGUI();
    }//GEN-LAST:event_undoButtonActionPerformed

    private void redoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoButtonActionPerformed
        // Like undo, but backwards.
        Move currentMove = this.redoStack.pop();
        this.redoMove(currentMove);
        this.undoStack.add(currentMove);
        this.updateUndoGUI();
    }//GEN-LAST:event_redoButtonActionPerformed

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        // Like start, but backwards.
        while (!this.redoStack.isEmpty()) {
            Move currentMove = this.redoStack.pop();
            this.redoMove(currentMove);
            this.undoStack.add(currentMove);
        }
        this.updateUndoGUI();
    }//GEN-LAST:event_endButtonActionPerformed

    private void makeMove() {
        /* Get values from the UI and draw the move and some undo stuff.
         * Even clicking on the board goes via this method, as clicking puts
         * values into the UI first.
         */
        Board board = this.boardView.getBoard();
        xText.setText(xText.getText().toUpperCase());
        int xCoord = 0;
        int yCoord = 0;
        try {
            // Some char -> short -> int magic. 'A' - 65 = 0. Wahey!
            xCoord = (xText.getText().toCharArray())[0] - 65;
            // 1 based index of board vs. 0 based index of arrays.
            yCoord = Integer.parseInt(yText.getText()) - 1;
        }
        /* Set to illegal positions, that will get picked up by error checking
         * later. Should probably make an error method or something, or
         * different methods for different errors, or one method with an enum
         * argument, or maybe a string argument - less structured but easier?
         * Or maybe throw my own exception class and catch it somewhere from
         * every event - not main method, somehow else. Hmm. Exceptions from 
         * event handlers are tricky.
         */
        catch (ArrayIndexOutOfBoundsException e) {
            xCoord = 9;
        }
        catch (NumberFormatException e) {
            yCoord = 9;
        }
        if (
                xCoord >= 0
                && xCoord <= 8
                && yCoord >= 0
                && yCoord <= 8
        ) {
            if (board.getBoardPosition(xCoord, yCoord) == Board.CLEAR) {
                board.setBoardPosition(xCoord, yCoord, this.currentColour);
                // Add this successful move to the undo stack.
                this.undoStack.add(new Move(
                        xCoord,
                        yCoord,
                        this.currentColour
                ));
                /* Wipe the redoStack, as this move will be another branch.
                 * Not that I'm using branches of undo...
                 */
                this.redoStack.clear();
                this.updateUndoGUI();
                // And set the colour for the next move.
                this.setCurrentColour(
                        this.currentColour == Board.BLACK
                        ? Board.WHITE
                        : Board.BLACK
                );
                this.boardView.repaint();
                this.errorLabel.setText("");
            }
            else {
                errorLabel.setText("This position has already been played.");
            }
        }
        else {
            errorLabel.setText("Invalid position.");
        }
    }

    /**
     * Place a stone (make a move) at the specified position and update the
     * game board and move text fields. Publicly available for event handlers.
     *
     * @param x X position on the board. Uses 0 based index, not game labels
     * A-H and 1-9. Valid values: 0-8.
     * @param y Y position on the board. Uses 0 based index, not game labels
     * A-H and 1-9. Valid values: 0-8.
     */
    public void makeMove(int x, int y) {
        // See comments in makeMove() for the arithmetic.
        this.xText.setText(new String(new char[] {(char) (x + 65)}));
        this.yText.setText((new Integer(y + 1)).toString());
        this.makeMove();
    }
    
    private void updateUndoGUI() {
        // Dismiss any errors from the last failed move, if any.
        this.errorLabel.setText("");

        int undoSize = this.undoStack.size();
        int redoSize = this.redoStack.size();
        // undoSize + redoSize is the total moves, undoSize is the moves past.
        this.moveLabel.setText("Move " + undoSize + "/" + (undoSize + redoSize));

        // Disable/Enable the appropriate buttons
        if (undoSize > 0) {
            this.startButton.setEnabled(true);
            this.undoButton.setEnabled(true);
        }
        else {
            this.startButton.setEnabled(false);
            this.undoButton.setEnabled(false);
        }
        
        if (redoSize > 0) {
            this.endButton.setEnabled(true);
            this.redoButton.setEnabled(true);
        }
        else {
            this.endButton.setEnabled(false);
            this.redoButton.setEnabled(false);
        }
    }
    
    private void undoMove(Move move) {
        // Clear the position
        this.boardView.getBoard().setBoardPosition(
                move.getX(),
                move.getY(),
                Board.CLEAR
        );
        this.boardView.repaint();
        // Make sure we resume play from the right colour.
        this.setCurrentColour(move.getColour());
    }
    
    private void redoMove(Move move) {
        // Like undoMove, but backwards.
        this.boardView.getBoard().setBoardPosition(
                move.getX(),
                move.getY(),
                move.getColour()
        );
        this.boardView.repaint();
        this.setCurrentColour(move.getColour() == Board.BLACK ? Board.WHITE : Board.BLACK);
    }
    
    private void setCurrentColour(int colour) {
        // Utility method for updating the UI and setting the right colour.
        this.currentColour = colour;
        if (this.currentColour == Board.BLACK) {
            this.colourLabel.setText("Black's move");
        }
        else {
            this.colourLabel.setText("White's move");
        }
    }
    
    /**
     * Just starts up a new window/game.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private capturegame.board.BoardView boardView;
    private javax.swing.JLabel colourLabel;
    private javax.swing.JButton endButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel moveLabel;
    private javax.swing.JButton redoButton;
    private javax.swing.JButton startButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton undoButton;
    private javax.swing.JLabel xLabel;
    private javax.swing.JTextField xText;
    private javax.swing.JLabel yLabel;
    private javax.swing.JTextField yText;
    // End of variables declaration//GEN-END:variables

    private int currentColour;
    private Stack<Move> undoStack;
    private Stack<Move> redoStack;
}
