package moe.haruue.helloworld.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_right.*
import moe.haruue.helloworld.R

/**
 *
 * @author Haruue Icymoon haruue@caoyue.com.cn
 */
class RightFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_right, container, false);
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    fun onLeftFragmentButtonClicked(buttonName: String) {
        text1.text = "You clicked $buttonName"
    }

}