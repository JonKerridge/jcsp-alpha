
//////////////////////////////////////////////////////////////////////
//                                                                  //
//  JCSP ("CSP for Java") Libraries                                 //
//  Copyright (C) 1996-2018 Peter Welch, Paul Austin and Neil Brown //
//                2001-2004 Quickstone Technologies Limited         //
//                2005-2018 Kevin Chalmers                          //
//                                                                  //
//  You may use this work under the terms of either                 //
//  1. The Apache License, Version 2.0                              //
//  2. or (at your option), the GNU Lesser General Public License,  //
//       version 2.1 or greater.                                    //
//                                                                  //
//  Full licence texts are included in the LICENCE file with        //
//  this library.                                                   //
//                                                                  //
//  Author contacts: P.H.Welch@kent.ac.uk K.Chalmers@napier.ac.uk   //
//                                                                  //
//////////////////////////////////////////////////////////////////////

package jcsp.awt;

import java.awt.event.*;
import jcsp.lang.*;

/**
 * @author P.D. Austin and P.H. Welch
 */
class AdjustmentEventHandler implements AdjustmentListener
{
   /**
    * The Channel AdjustmentEvent notifications are sent down.
    */
   private ChannelOutputInt event;
   
   /**
    * Constructs a new AdjustmentEventHandler with the specified event Channel.
    *
    * @param event The Channel AdjustmentEvent notifications are sent down.
    */
   public AdjustmentEventHandler(ChannelOutputInt event)
   {
      this.event  = event;
   }
   
   /**
    * Invoked when an adjustment occurs on the component the event handler is
    * listening to. Notifies the event process that an AdjustmentEvent has
    * occurred. Some notifications will be lost so there are no guarantees
    * that all events generated will be processed. Sets the value to the
    * current value of the component.
    *
    * @param e The parameters associated with this event
    */
   public void adjustmentValueChanged(AdjustmentEvent e)
   {
      event.write(e.getValue());
   }
}