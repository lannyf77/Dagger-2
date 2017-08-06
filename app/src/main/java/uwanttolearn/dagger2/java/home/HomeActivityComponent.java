package uwanttolearn.dagger2.java.home;

import android.support.v7.widget.RecyclerView;

import dagger.Component;

/**
 * Created by waleed on 06/08/2017.
 */
@Component(modules = HomeActivityModule.class)
public interface HomeActivityComponent {

    RecyclerView.LayoutManager getLayoutManager();

}

