package AJWTI.projectmanager6

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class workspace_nav : Fragment() {

    companion object {
        fun newInstance() = workspace_nav()
    }

    private lateinit var viewModel: WorkspaceNavViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.workspace_nav, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WorkspaceNavViewModel::class.java)
        // TODO: Use the ViewModel
    }

}