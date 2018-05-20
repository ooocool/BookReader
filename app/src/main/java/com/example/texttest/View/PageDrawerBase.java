package com.example.texttest.View;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.widget.Scroller;


public class PageDrawerBase {
    protected TxtReaderView readerView;
    protected TxtReaderContext readerContext;
    protected Scroller scroller;
    protected Path mPath = new Path();
    protected ITextSelectDrawer textSelectDrawer;


    public PageDrawerBase(TxtReaderView readerView, TxtReaderContext readerContext, Scroller scroller) {

        this.readerView = readerView;
        this.readerContext = readerContext;
        this.scroller = scroller;
    }
    protected int getWidth() {
        return readerView.getWidth();
    }
    protected float getMoveDistance() {
        return readerView.getMoveDistance();
    }
    protected int getHeight() {
        return readerView.getHeight();
    }
    protected Bitmap getTopPage() {
        return readerView.getTopPage();
    }
    protected Bitmap getBottomPage() {
        return readerView.getBottomPage();
    }



    public ITextSelectDrawer getTextSelectDrawer() {
        if (textSelectDrawer == null) {
            textSelectDrawer = new NormalTextSelectDrawer();
        }
        return textSelectDrawer;
    }

    public void setTextSelectDrawer(ITextSelectDrawer textSelectDrawer) {
        this.textSelectDrawer = textSelectDrawer;
    }



}
