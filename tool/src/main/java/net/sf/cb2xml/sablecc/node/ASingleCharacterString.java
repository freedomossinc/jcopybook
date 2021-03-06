/* This file was generated by SableCC (http://www.sablecc.org/). */
package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

import java.util.*;


public final class ASingleCharacterString extends PCharacterString
{
    private PCharacterSubstring _characterSubstring_;

    public ASingleCharacterString ()
    {
    }

    public ASingleCharacterString (PCharacterSubstring _characterSubstring_)
    {
        setCharacterSubstring (_characterSubstring_);
    }

    public Object clone ()
    {
        return new ASingleCharacterString((PCharacterSubstring) cloneNode (
                _characterSubstring_));
    }

    public void apply (Switch sw)
    {
        ((Analysis) sw).caseASingleCharacterString (this);
    }

    public PCharacterSubstring getCharacterSubstring ()
    {
        return _characterSubstring_;
    }

    public void setCharacterSubstring (PCharacterSubstring node)
    {
        if (_characterSubstring_ != null)
        {
            _characterSubstring_.parent (null);
        }

        if (node != null)
        {
            if (node.parent () != null)
            {
                node.parent ().removeChild (node);
            }

            node.parent (this);
        }

        _characterSubstring_ = node;
    }

    public String toString ()
    {
        return "" + toString (_characterSubstring_);
    }

    void removeChild (Node child)
    {
        if (_characterSubstring_ == child)
        {
            _characterSubstring_ = null;

            return;
        }
    }

    void replaceChild (Node oldChild, Node newChild)
    {
        if (_characterSubstring_ == oldChild)
        {
            setCharacterSubstring ((PCharacterSubstring) newChild);

            return;
        }
    }
}
