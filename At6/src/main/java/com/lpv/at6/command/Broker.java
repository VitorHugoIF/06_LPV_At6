/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at6.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vitor.marcelino
 */
public class Broker {
    private List<ITaskCommand> tasks = new ArrayList<ITaskCommand>();
    
    public void executeTask(ITaskCommand task) {
        this.tasks.add(task);
        task.execute();
    }

    public void cancelLastTask() {
        if (!tasks.isEmpty()) {
            int index = this.tasks.size() - 1;

            ITaskCommand task = this.tasks.get(index);
            task.cancel();
            this.tasks.remove(index);
        }
    }
}
