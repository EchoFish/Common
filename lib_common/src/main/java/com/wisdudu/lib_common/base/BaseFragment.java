package com.wisdudu.lib_common.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wisdudu.lib_common.R;

import me.yokeyword.fragmentation.SupportFragment;
import me.yokeyword.fragmentation.anim.DefaultVerticalAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

/**
 * 文件描述：
 * <p>
 * 作者：   Created by sven on 2017/10/21.
 */

public abstract class BaseFragment extends SupportFragment {

    protected View mRootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = initBinding(inflater, container, savedInstanceState);
        return mRootView;
    }

    protected abstract View initBinding(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    @Override
    protected int getWindowBackground() {
        return R.color.windowBackground;
    }

    @Override
    protected FragmentAnimator onCreateFragmentAnimator() {
        return new DefaultVerticalAnimator();
    }
}
