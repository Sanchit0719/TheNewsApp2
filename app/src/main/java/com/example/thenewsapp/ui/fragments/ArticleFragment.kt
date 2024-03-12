//package com.example.thenewsapp.ui.fragments
//
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import com.example.newsprojectpractice.R
//import com.example.newsprojectpractice.databinding.FragmentArticleBinding
//import com.example.thenewsapp.ui.NewsActivity
//import com.example.thenewsapp.ui.NewsViewModel
//
////import com.example.thenewsapp.R
//
//
//class ArticleFragment: Fragment (R.layout. fragment_article) {
//
//}
//    lateinit var newsViewModel: NewsViewModel
//    val args: ArticleFragmentArgs by novArgs()
//    lateinit var binding: FragmentArticleBinding
//
//    override fun onViewCreated (view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        binding = FragmentArticleBinding.bind(view)
//
//
//        newsViewModel = (activity as NewsActivity).newsViewModel
//
//}

package com.example.thenewsapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.navArgs
import com.example.newsprojectpractice.R
import com.example.newsprojectpractice.databinding.FragmentArticleBinding
import com.example.thenewsapp.ui.NewsActivity
import com.example.thenewsapp.ui.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article) {

    // Using lazy initialization for ViewModel and args to ensure they are only initialized when needed
//    private val newsViewModel: NewsViewModel by lazy {
//        (activity as NewsActivity<Any?>).newsViewModel
//    }

    private val newsViewModel: NewsViewModel by lazy {
        (activity as NewsActivity).newsViewModel
    }

    // Using the navArgs() delegate to get the arguments passed to this Fragment
    private val args: ArticleFragmentArgs by navArgs()

    // ViewBinding to access the layout's views
    private var _binding: FragmentArticleBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentArticleBinding.bind(view)

        // Example of using arguments passed to this Fragment
        // val article = args.article // Assuming ArticleFragmentArgs has an argument 'article'

        // Setup your UI here using newsViewModel and args as needed
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // To avoid memory leaks
    }
}
