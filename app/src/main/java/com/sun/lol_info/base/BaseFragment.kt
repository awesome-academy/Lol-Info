package com.sun.lol_info.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<V : ViewBinding> : Fragment() {
    private var _viewBinding: ViewBinding? = null
    protected abstract val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> V
    protected val viewBinding: V
        get() = _viewBinding as V

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _viewBinding = bindingInflater.invoke(inflater, container, false)
        return _viewBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initComponents()
        initEvents()
        initData()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _viewBinding = null
    }

    abstract fun initComponents()

    abstract fun initEvents()

    abstract fun initData()
}
