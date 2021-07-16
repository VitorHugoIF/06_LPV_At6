/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lpv.at6.command;

/**
 *
 * @author vitor.marcelino
 */
public interface ITaskCommand {
    void execute();
    void cancel();
}
