/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhuwan.jsf.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author bhuwan
 */
public class PhaseListnerDemo implements PhaseListener {

    public void afterPhase(PhaseEvent pe) {
        System.out.println("After Phase:: " + pe.getPhaseId());
    }

    public void beforePhase(PhaseEvent pe) {
        System.out.println("Before Phase:: " + pe.getPhaseId());
    }

    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

}
