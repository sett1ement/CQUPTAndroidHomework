package moe.haruue.helloworld.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moe.haruue.helloworld.R

/**
 *
 * @author Haruue Icymoon haruue@caoyue.com.cn
 */
class LeftFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_left, container, false);
    }

}