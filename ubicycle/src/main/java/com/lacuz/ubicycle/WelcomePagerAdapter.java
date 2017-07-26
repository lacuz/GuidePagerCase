package com.lacuz.ubicycle;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class WelcomePagerAdapter extends android.support.v4.view.PagerAdapter
{
  private List<View> a;

  public WelcomePagerAdapter(List<View> paramList)
  {
    this.a = paramList;
  }

  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup.removeView((View)this.a.get(paramInt));
  }

  public int getCount()
  {
    return this.a.size();
  }

  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.addView((View)this.a.get(paramInt), 0);
    return this.a.get(paramInt);
  }

  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
}