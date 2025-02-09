package com.example.cardofvolonteers.ui.list;

import androidx.fragment.app.Fragment;


public class UsersListFragment extends Fragment {
/*
    RecyclerView recyclerView;
    UsersAdapter adapter;
    List<User> userList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.card_of_user, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = recyclerView.findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
        Call<UsersResponce> call = RetrofitClient.getInstance().getApi().getUsers();
        call.enqueue(new Callback<UsersResponce>() {
            @Override
            public void onResponse(Call<UsersResponce> call, Response<UsersResponce> response) {
                userList = response.body().getUsers();
                adapter = new UsersAdapter(getActivity(), userList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<UsersResponce> call, Throwable throwable) {

            }
        });

    }
*/
}