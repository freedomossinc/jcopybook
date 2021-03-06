/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class ARenamesItemElementaryItem extends PElementaryItem
{
    private PRenamesItem _renamesItem_;

    public ARenamesItemElementaryItem ()
    {
    }

    public ARenamesItemElementaryItem (PRenamesItem _renamesItem_)
    {
        setRenamesItem (_renamesItem_);
    }

    public Object clone ()
    {
        return new ARenamesItemElementaryItem((PRenamesItem) cloneNode (
                _renamesItem_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseARenamesItemElementaryItem (this);
    }

    public PRenamesItem getRenamesItem ()
    {
        return _renamesItem_;
    }

    public void setRenamesItem (PRenamesItem node)
    {
        if (_renamesItem_ != null)
        {
            _renamesItem_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _renamesItem_ = node;
    }

    public String toString ()
    {
        return "" + toString (_renamesItem_);
    }

    void removeChild (Node child)
    {
        if (_renamesItem_ == child)
        {
            _renamesItem_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_renamesItem_ == oldChild)
        {
            setRenamesItem ((PRenamesItem) newChild);

            return;
        }
    }
}
