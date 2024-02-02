package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.PlayStrategy;
import view.AppWindow;

public class StrategySelectionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
       String action = e.getActionCommand();
       switch (action){
            case AppWindow.highLowAction:
            App.game.setStrategy(PlayStrategy.HighLow);
            break;
        case AppWindow.closerAwayAction:
            App.game.setStrategy(PlayStrategy.CloserAway);
            break;
       }
    }
    
}
